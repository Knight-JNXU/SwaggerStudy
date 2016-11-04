package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Knight_JXNU on 2016/8/5.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //这个要填 controller 的路径
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("程序猿DD")
                .version("1.0")
                .build();
    }

//    @Bean
//    public Docket testApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("test")
//                .genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(true)
//                .pathMapping("/") //base,最终调用接口后会和paths拼接在一起
//                .select()
//                .paths(or(regex("/api/.*")))
//                .build()
//                .apiInfo(testApiInfo());
//    }
//
//    private ApiInfo testApiInfo(){
//        ApiInfo apiInfo = new ApiInfo("Electronic Health Record(EHR) Platform API",//大标题
//            "EHR Platform's REST API, all the applications could access the Object model data via JSON.",//小标题
//            "0.1",//版本
//            "NO terms of service",
//            "365384722@qq.com",//作者
//            "The Apache License, Version 2.0",//链接显示文字
//            "http://www.apache.org/licenses/LICENSE-2.0.html"//网站链接
//        );
//        return apiInfo;
//    }
//
//    @Bean
//    public Docket demoApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("demo")
//                .genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(false)
//                .pathMapping("/")
//                .select()
//                .paths(or(regex("/demo/.*"))) //过滤的接口
//                .build()
//                .apiInfo(demoApiInfo());
//    }
//
//    private ApiInfo demoApiInfo(){
//        ApiInfo apiInfo = new ApiInfo("Electronic Health Record(EHR) Platform API",//大标题
//                "EHR Platform's REST API, for system administrator",//小标题
//                "1.0",//版本
//                "NO terms of service",
//                "365384722@qq.com",//作者
//                "The Apache License, Version 2.0",//链接显示文字
//                "http://www.apache.org/licenses/LICENSE-2.0.html"//网站链接
//                );
//        return apiInfo;
//    }
}
