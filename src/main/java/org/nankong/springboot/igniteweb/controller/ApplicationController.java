package org.nankong.springboot.igniteweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/app")
public class ApplicationController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);
    @Value("${application.env}")
    String env;
    @RequestMapping(value = "/index")
    public  String index(){
        System.out.println("dayinle");
        logger.info("改了么");
        logger.info("当前所在环境维为："+env);
        return "当前所在环境维为："+env;
    }
}
