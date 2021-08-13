package com.fz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:Fazil Amirli
 * Created on: 8/13/2021
 */
public class HelloMaven {
    private final static Logger log = LoggerFactory.getLogger(HelloMaven.class);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        log.debug("I'm here");
        log.info("Hello Info");
        Thread.currentThread().setName("myThread");
        Thread.sleep(4000l);
        log.info("Hello Debug");
    }
}
