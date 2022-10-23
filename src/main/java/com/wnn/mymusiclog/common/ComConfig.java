package com.wnn.mymusiclog.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ConfigurationProperties(prefix = "response")
@PropertySource(value = "classpath:response.properties")
public class ComConfig {
    public Map<String,String> codes=new ConcurrentHashMap<>();
}
