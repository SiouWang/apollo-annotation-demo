package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class PropertyService {

    private static final Logger logger = LoggerFactory.getLogger(PropertyService.class);

    @Value("${dbName: default value}")
    private String dbName;

    @Value("${dbUrl: default value}")
    private String dbUrl;

    @Value("${serverName: default value}")
    private String serverName;

    public void getConfig() {
        logger.info("dbName = {}", dbName);
        logger.info("dbUrl = {}", dbUrl);
        logger.info("serverName = {}", serverName);
    }

}
