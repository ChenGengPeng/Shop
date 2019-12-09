package com.shop.heima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdminController {
    @PostMapping("/login")
    @ResponseBody
    public String login(
            @RequestParam("username") String username,  @RequestParam("password")String password){
        String msg = "登录失败，用户名或者密码错误";
        System.out.println(username+password);
        if (username.equals("admin")&& password.equals("123456")){
            msg = "登录成功";
        }
        return msg;
    }

}
