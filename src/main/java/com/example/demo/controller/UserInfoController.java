package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;


    @GetMapping
    @ResponseBody
    public String queryAll() {
        List<UserInfo> userInfoList=userInfoService.queryAll();
        return JSON.toJSONString(userInfoList);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String query(@PathVariable(value = "id")Integer id){
        UserInfo userInfo=userInfoService.queryById(id);
        List<UserInfo> userInfoList=new ArrayList<>();
        userInfoList.add(userInfo);
        return JSON.toJSONString(userInfoList);
    }

    @PostMapping
    @ResponseBody
    public String add(@RequestBody UserInfo userInfo){
        userInfoService.add(userInfo);
        return "Added OK";
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public String delete(@PathVariable("id")Integer id){
        userInfoService.delete(id);
        return "Deleted OK";
    }

    @PutMapping("/{id}")
    @ResponseBody
    public String update(@PathVariable("id")Integer id,@RequestBody UserInfo userInfo){
        userInfo.setId(id);
        userInfoService.update(userInfo);
        return "Updated OK";
    }




}
