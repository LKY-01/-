package com.project.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.demo.Bean.Edu_exp;
import com.project.demo.Bean.User;
import com.project.demo.mapper.Edu_expMapper;
import com.project.demo.service.Edu_expService;
import com.project.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Edu_expServiceImpl extends ServiceImpl<Edu_expMapper, Edu_exp> implements Edu_expService {
    @Autowired
    private Edu_expMapper edu_expMapper;
    @Override
    public Object selectByedu_exp_id(Integer edu_exp_id) {
        Edu_exp edu_exp;
        edu_exp = edu_expMapper.selectByedu_exp_id(edu_exp_id);
        return ResultUtil.success(edu_exp,20,"查询成功");
    }

    @Override
    public Object deleteByedu_exp_id(Integer edu_exp_id) {
        edu_expMapper.deleteByedu_exp_id(edu_exp_id);
        return ResultUtil.success(null,20,"删除成功");
    }
}
