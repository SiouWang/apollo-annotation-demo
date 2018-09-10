package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class PropertyService {

    private static final Logger logger = LoggerFactory.getLogger(PropertyService.class);

    @Value("${userName}")
    private String userName;

    @Value("${age}")
    private String age;

    @Value("${address}")
    private String address;

    public void getConfig() {
        logger.info("PropertyService: userName = {}, age = {}, address = {}", userName, age, address);
    }

}
