package com.project.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.demo.Bean.User;

public interface UserService extends IService<User> {
    Object deleteByID(Integer USER_ID);
    Object selectByID(Integer USER_ID);
    public Object addByID(User user);
    public Object changeByID(User user);
}