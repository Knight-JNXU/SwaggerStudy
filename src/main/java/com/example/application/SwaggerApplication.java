package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Knight_JXNU on 2016/11/4.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.config,com.example.controller"})
public class SwaggerApplication {

    //启动 spring boot 之后，使用 chrome 访问 http://localhost:8080/swagger-ui.html 就能看到 swagger 的页面了
    public static void main(String[] args){
        SpringApplication.run(SwaggerApplication.class);
    }

}
