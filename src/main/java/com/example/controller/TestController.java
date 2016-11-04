package com.example.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Knight_JXNU on 2016/11/4.
 */
@Controller
@RequestMapping(value = "/api/test")
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/base", method = RequestMethod.GET)
    public String base(){
        //demo url:http://localhost:8080/api/test/base
        return "base";
    }

    @ResponseBody
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(@ApiParam(required = true, name = "name", value = "姓名")
                       @RequestParam(name = "name") String name){
        //demo url:http://localhost:8080/api/test/show?name=%22abc%22
        return name;
    }
}
