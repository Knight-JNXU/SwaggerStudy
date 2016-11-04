package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Knight_JXNU on 2016/11/4.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"config"})
public class SwaggerApplication {

    public static void main(String[] args){
        SpringApplication.run(SwaggerApplication.class);
    }

}
