package com.project.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.demo.Bean.User;
import com.project.demo.mapper.UserMapper;
import com.project.demo.service.UserService;
import com.project.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Object deleteByID(Integer USER_ID) {
        userMapper.deleteByID(USER_ID);
        return ResultUtil.success(null,20,"删除成功");
    }

    @Override
    public Object selectByID(Integer USER_ID) {
        User user ;
        user = userMapper.selectByID(USER_ID);
        return ResultUtil.success(user,20,"查询成功");
    }

    @Override
    public Object addByID(User user) {
        userMapper.addByID(user);
        return ResultUtil.success(null,20,"添加成功");
    }

    @Override
    public Object changeByID(User user) {
        userMapper.changeByID(user);
        return ResultUtil.success(null,200,"修改成功");
    }
}
