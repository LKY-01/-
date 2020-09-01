package com.project.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.demo.Bean.Volunteer_exp;

public interface Volunteer_expService extends IService<Volunteer_exp> {
    Object selectByvolu_id(Integer volu_id);
    Object deleteByvolu_id(Integer volu_id);
}
