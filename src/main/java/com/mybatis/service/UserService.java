package com.mybatis.service;

import com.mybatis.dao.UserMapper;
import com.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有的用户
     * @return
     */
    public User getUserList(String id){
        return userMapper.getUserList(id);
    }

}
