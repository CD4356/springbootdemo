package com.cd4356.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = @Controller + @ResponseBody
 *
 * @RestController 注解的意思是:
 * controller里面的方法都以json格式输出,不用再写什么jackjson配置的了！
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String hello(){
        return "这是我的第一个SpringBoot项目";
    }

}
