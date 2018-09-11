package org.nankong.springboot.igniteweb.service;

import org.nankong.springboot.igniteweb.po.User;
import org.nankong.springboot.igniteweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return user.getUsername();
    }
    public String queryLoginUser(String username,String password){
        User user = userRepository.getUserByUsernameAndPassword(username,password);
        if(user!=null)
            return user.getUsername()+"登录成功";
        else
            return "用户或密码不正确";
    }
    public String queryValidLoginUser(String username,String password){
        User user = userRepository.getUserBySql(username,password);
        if(user!=null)
            return user.getUsername()+"登录成功";
        else
            return "用户或密码不正确";
    }
}
