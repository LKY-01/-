package com.project.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.demo.Bean.Project_exp;
import com.project.demo.mapper.Project_expMapper;
import com.project.demo.service.Project_expService;
import com.project.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Project_expServiceImpl extends ServiceImpl<Project_expMapper, Project_exp> implements Project_expService {
    @Autowired
    private Project_expMapper project_expMapper;
    @Override
    public Object selectByproject_exp_id(Integer project_exp_id) {
        Project_exp project_exp;
        project_exp = project_expMapper.selectByproject_exp_id(project_exp_id);
        return ResultUtil.success(project_exp,20,"查询成功");
    }

    @Override
    public Object deleteByproject_exp_id(Integer project_exp_id) {
        project_expMapper.deleteByproject_exp_id(project_exp_id);
        return ResultUtil.success(null,20,"删除成功");
    }
}
