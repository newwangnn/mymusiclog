package com.wnn.mymusiclog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigurationProperties
@SpringBootApplication
@MapperScan("com.wnn.mymusiclog.mapper")
public class MymusiclogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymusiclogApplication.class, args);
	}

}
