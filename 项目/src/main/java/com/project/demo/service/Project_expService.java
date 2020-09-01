package com.project.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.demo.Bean.Project_exp;

public interface Project_expService extends IService<Project_exp> {
    Object selectByproject_exp_id(Integer project_exp_id);
    Object deleteByproject_exp_id(Integer project_exp_id);
}
