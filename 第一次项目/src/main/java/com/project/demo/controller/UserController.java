package com.project.demo.controller;

import com.project.demo.Bean.User;
import com.project.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@ComponentScan({"com.project.demo.service"})
@RestController
@MapperScan("com.project.demo.mapper")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/show6")
    public Object string(){
        return "User测试成功";
    }
    @RequestMapping("/user/delete/{USER_ID}")
    public Object deleteByID(@PathVariable int USER_ID) {
        return userService.deleteByID(USER_ID);
    }
    @RequestMapping("/user/select/{USER_ID}")
    public Object selectByID(@PathVariable int USER_ID){
        return userService.selectByID(USER_ID);
    }
    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public Object addByID(@Validated User user){
        return userService.addByID(user);
    }
    @RequestMapping(value ="/user/change",method = RequestMethod.POST)
    public Object changeByID(@Validated User user){
        return userService.changeByID(user);
    }
}
