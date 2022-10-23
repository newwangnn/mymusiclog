package com.wnn.mymusiclog;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wnn.mymusiclog.bean.MachineBaseinfo;
import com.wnn.mymusiclog.mapper.MachineBaseInfoMapper;
import com.wnn.mymusiclog.mapper.ProvinceMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MymusiclogApplicationTests {

	@Autowired
	private ProvinceMapper provinceMapper;
	@Autowired
	private MachineBaseInfoMapper machineBaseInfoMapper;

	@Test
	public void selectall() {
		System.out.println(("----- selectAll method test ------"));
		QueryWrapper<MachineBaseinfo> macbean = new QueryWrapper<>();
		macbean.select("mid","song_warehouse_version","exec_version");
		List<MachineBaseinfo> machine_baseinfos = machineBaseInfoMapper.selectList(macbean);
		MachineBaseinfo machineBaseinfo = machine_baseinfos.get(0);
		System.out.println(machineBaseinfo);
//		machine_baseinfos.forEach(System.out::println);
	}

}
