package com.kgc.controller;

import com.kgc.pojo.User;
import com.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.jar.JarEntry;

/**
 * @author YaChow
 * @create 2021-03-08-9:55
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/checkLogin")
    public String checkLogin(@RequestParam("user_code")String user_code,
                             @RequestParam("password")String password,
                             HttpSession session){
        Integer row = userService.getByCodeAndPwd(user_code,password);
        if(row>0){
            session.setAttribute("USERNAME",user_code);
            return "forward:/book/getAllByCondition";
        }
        return "redirect:/user/toLogin";
    }


    @RequestMapping("/register")
    public String register(@RequestParam("user_code")String user_code,
                           @RequestParam("password")String password,
                           @RequestParam("gender")String gender,
                           @RequestParam("email")String email){
        User user = new User();
        user.setUser_code(user_code);
        user.setPassword(password);
        user.setGender(gender);
        user.setEmail(email);
        Integer row = userService.addUser(user);
        if(row>0){
            return "redirect:/user/toLogin";
        }
        return "redirect:/user/toRegister";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("USERNAME");
        return "redirect:/user/toLogin";
    }
}
