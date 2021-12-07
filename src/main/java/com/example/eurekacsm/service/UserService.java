package com.example.eurekacsm.service;

import entity.user;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "eureka-prd")
public interface UserService {

    @GetMapping(value = "login")
    String getUser(@RequestParam(value = "uname")String uname,@RequestParam(value = "password")String password);

    @GetMapping(value = "getAllBolgDetail")
    String getAllBolgDetail();

    }
