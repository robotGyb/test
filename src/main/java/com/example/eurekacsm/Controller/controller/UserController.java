package com.example.eurekacsm.Controller.controller;

import com.example.eurekacsm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.user;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("getAllDetail")
    @ResponseBody
    public String getAllDetail(){
        String detail = userService.getAllBolgDetail();
        return detail;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(String uname,String password){
        String u = userService.getUser(uname,password);
        return u;
    }

}
