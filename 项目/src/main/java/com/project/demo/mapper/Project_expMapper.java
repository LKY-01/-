package com.project.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo.Bean.Project_exp;

public interface Project_expMapper extends BaseMapper<Project_exp> {
    Project_exp selectByproject_exp_id(Integer project_exp_id);
    void deleteByproject_exp_id(Integer project_exp_id);
}
