package com.example.controller;

import com.example.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Knight_JXNU on 2016/11/4.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private String username = "liuwen";

    @ApiOperation(value = "获取用户", notes = "getUser")
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser(){
        return username;
    }

    @ApiOperation(value = "创建用户", notes = "传入 name 创建 user")
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public User createUserByPro(@RequestBody String name,@RequestBody int age){
        return (new User(name, age));
    }

    @ApiOperation(value = "创建用户", notes = "传入 name 创建 user")
    @ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "liuwen")  //发现还不能把 username 赋值给 dataType
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public User createUserByUser(User user){
        return user;
    }

}
