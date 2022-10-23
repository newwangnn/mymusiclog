package com.wnn.mymusiclog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class SongPlayService {
    Logger logger = LoggerFactory.getLogger(SongPlayService.class);

    //处理 MINIK_CLIENT_SONG_PLAY_OPERATE_REQ 事件
    public String processEvent(String msg) {
        /*   时间戳&机器id&事件&JSON&歌库版本号
        1575302397
        &86816
        &MINIK_CLIENT_ADVERTISEMENT_RECORD
        &{"src_verison": 2558, "mid": 86816, "adv_type": 4, "src_type": 2558, "uid": 0, "session_id": 32268, "event_id": 1, "time": 1575302395}
        &3.0.1.15
        &2.4.4.30
         */

        System.out.println(msg);
        logger.info(msg);

        return "ok";
    }
}
