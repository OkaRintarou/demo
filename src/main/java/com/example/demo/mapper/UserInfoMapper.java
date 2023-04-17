package com.example.demo.mapper;

import com.example.demo.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserInfoMapper {
    void add(UserInfo userInfo);

    void delete(Integer id);

    void update(UserInfo userInfo);

    UserInfo queryById(Integer id);

    List<UserInfo> queryAll();


}
