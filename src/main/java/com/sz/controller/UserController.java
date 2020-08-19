package com.sz.controller;

import com.sz.entity.User;
import com.sz.service.IUserService;
import com.sz.service.impl.UserServiceImpl;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/admin")
    public String ByUsserAll(){
        return "xx";
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<User> UserAll(){
        List<User> users = userService.ByUserRole();
        System.out.println(users);
        return users;
    }



    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable(name = "id")int id){
        return String.valueOf(id);
    }


    @PostMapping("/Us")
    @ResponseBody
    public User ByUser(@RequestBody User user){
        return user;
    }


    @RequestMapping("/thy")
    public void thymeleaf1(ModelAndView modelAndView){
        modelAndView.setViewName("one");
        modelAndView.addObject("test","xx" );
    }


}
