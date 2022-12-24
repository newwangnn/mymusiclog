package com.wnn.mymusiclog.loggen;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wnn.mymusiclog.bean.MachineBaseinfo;
import com.wnn.mymusiclog.bean.MachineConsumeDetail;
import com.wnn.mymusiclog.bean.Song;
import com.wnn.mymusiclog.bean.UserAliPay;
import com.wnn.mymusiclog.mapper.ConsumeDetailMapper;
import com.wnn.mymusiclog.mapper.MachineBaseInfoMapper;
import com.wnn.mymusiclog.mapper.SongMapper;
import com.wnn.mymusiclog.mapper.UserAliPayMapper;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@SpringBootTest
public class KindsOfLogProduce {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private MachineBaseInfoMapper machineBaseInfoMapper;
    @Autowired
    private ConsumeDetailMapper consumeDetailMapper;
    @Autowired
    private SongMapper songMapper;
    @Autowired
    private UserAliPayMapper userAliPayMapper;

    @Test
    public void songplay() {

        try {
            FileInputStream fs = new FileInputStream("E:\\onlineEducation\\mymusiclog\\mylogdata\\minik_jo_20191203000500_9542");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            String s = br.readLine();
            System.out.println(s);

            //截字符串转JSON对象
            String[] split = s.split("&");
            JSONObject json = JSONObject.fromObject(split[3]);

            QueryWrapper<MachineBaseinfo> macbean = new QueryWrapper<>();
            macbean.select("mid", "song_warehouse_version", "exec_version");
            List<MachineBaseinfo> machineBaseinfos = machineBaseInfoMapper.selectList(macbean);

            QueryWrapper<Song> songQueryWrapper = new QueryWrapper<>();
            songQueryWrapper.select("source_id", "name");
            List<Song> songs = songMapper.selectList(songQueryWrapper);

            QueryWrapper<MachineConsumeDetail> consumeDetailQueryWrapper = new QueryWrapper<>();
            consumeDetailQueryWrapper.select("pkg_id", "order_id", "m_type", "uid");
            List<MachineConsumeDetail> machineConsumeDetails = consumeDetailMapper.selectList(consumeDetailQueryWrapper);

            QueryWrapper<UserAliPay> userAliPayQueryWrapper = new QueryWrapper<>();
            userAliPayQueryWrapper.select("uid");
            List<UserAliPay> userAliPays = userAliPayMapper.selectList(userAliPayQueryWrapper);

            int minNum = machineBaseinfos.size() < songs.size() ?
                    (machineBaseinfos.size() < machineConsumeDetails.size() ? machineBaseinfos.size() : machineConsumeDetails.size())
                    :
                    (songs.size() < machineConsumeDetails.size() ? songs.size() : machineConsumeDetails.size());

            Random random = new Random();
            StringBuffer buffer = new StringBuffer();


            boolean flag = true;
            while (flag) {
               /*
               1575302754&84104
               &MINIK_CLIENT_SONG_PLAY_OPERATE_REQ
               &{"songid": "lx138872", "mid": 84104, "optrate_type": 0, "uid": 49915617, "consume_type": 0, "play_time": 0,
                "dur_time": 0, "session_id": 34448, "songname": "Babe", "pkg_id": 2, "order_id": "W20191202234311U49915623M84104"}
                &3.0.0.80&2.4.4.06
                */
                long time = System.currentTimeMillis();
                buffer.append(time + "&");

                int index = random.nextInt(minNum);
                MachineBaseinfo machineBaseinfo = machineBaseinfos.get(index);
                Integer mid = machineBaseinfo.getMid();
                buffer.append(mid + "&");
                buffer.append("MINIK_CLIENT_SONG_PLAY_OPERATE_REQ&");

                json.element("songid", songs.get(index).getSourceId());
                json.element("songname", songs.get(index).getName().replace('&',' '));
                json.element("mid", mid);

                json.element("uid", userAliPays.get(index).getUid());
                json.element("consume_type", machineConsumeDetails.get(index).getMType());
                json.element("pkg_id", machineConsumeDetails.get(index).getPkgId());
                json.element("order_id", machineConsumeDetails.get(index).getOrderId());

                buffer.append(json.toString() + "&");

                String execVersion = machineBaseinfo.getExecVersion();
                buffer.append(execVersion + "&");
                String songWarehouseVersion = machineBaseinfo.getSongWarehouseVersion();
                buffer.append(songWarehouseVersion);


                String result = buffer.toString();
                buffer.delete(0, buffer.length());

                String url ="http://hadoop52:8080/event/MINIK_CLIENT_SONG_PLAY_OPERATE_REQ";
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
                MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
                map.add("msg", result);
                // 组装请求体
                HttpEntity<MultiValueMap<String, String>> request =
                        new HttpEntity<MultiValueMap<String, String>>(map, headers);
                // 发送post请求，并打印结果，以String类型接收响应结果JSON字符串
                String ok = restTemplate.postForObject(url, request, String.class);

                System.out.println(ok);

                Thread.sleep(1000);

            }

            br.close();
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
