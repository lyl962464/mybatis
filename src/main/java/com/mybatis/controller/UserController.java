package com.mybatis.controller;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(String id){
        return userService.getUserList(id);
    }
}
