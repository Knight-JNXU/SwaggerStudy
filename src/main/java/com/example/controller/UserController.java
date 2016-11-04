package com.example.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Knight_JXNU on 2016/11/4.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private String username = "liuwen";

    @ApiOperation(value = "获取用户", notes = "getUser")
    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public String getUser(){
        return username;
    }

}
