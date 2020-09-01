package com.project.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.demo.Bean.Edu_exp;

public interface Edu_expService extends IService<Edu_exp> {
    Object selectByedu_exp_id(Integer edu_exp_id);
    Object deleteByedu_exp_id(Integer edu_exp_id);
}
