package com.example.demo.service;

import com.example.demo.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    void add(UserInfo userInfo);
    void delete(Integer id);
    void update(UserInfo userInfo);
    UserInfo queryById(Integer id);
    List<UserInfo>queryAll();

}
