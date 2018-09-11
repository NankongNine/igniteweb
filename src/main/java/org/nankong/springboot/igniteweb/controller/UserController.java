package org.nankong.springboot.igniteweb.controller;

import org.nankong.springboot.igniteweb.po.User;
import org.nankong.springboot.igniteweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/addUser")
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setState("1");
        user.setCreatetime(new Date());
        return "用户名："+userService.addUser(user)+"注册成功！";
    }
    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                          @RequestParam("password") String password){

        return userService.queryValidLoginUser(username,password);
    }

}
