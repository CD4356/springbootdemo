package com.cd4356.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @SpringBootApplication注解 用于声明这是一个SpringBoot的应用
 * @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
 */
@SpringBootApplication
public class SpringbootdemoApplication {
    /**
     * AppApplication类是系统自动生成的，是默认的系统启动类，该类中只有一个main函数，不要放置其它多余的代码
     * @param
     */
    public static void main(String[] args) {
        /**
         * SpringApplication.run(AppApplication.class, args) 用来启动SpringBoot程序
         */
        SpringApplication.run(SpringbootdemoApplication.class, args);
        /**
         * 第一次创建Spring Boot项目，打印一条语句来显示程序是否已成功启动
         */
        System.out.println("Spring Boot项目已启动");
    }

}

