package com.baizhi.liu.controller;

import com.baizhi.liu.entity.User;
import com.baizhi.liu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("selectUser")
    public String selectUser(){

        List<User> users = userService.selectAll();

        return "index";
    }
    @RequestMapping("selectUsers")
    public String selectUsers(){
              return "index";
    }
}
