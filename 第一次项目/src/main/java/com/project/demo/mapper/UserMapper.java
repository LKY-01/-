package com.project.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    public void deleteByID(Integer USER_ID);
    public User selectByID(Integer USER_ID);
    public void addByID(User user);
    public void changeByID(User user);
}