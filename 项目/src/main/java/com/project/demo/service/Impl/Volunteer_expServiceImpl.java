package com.project.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.demo.Bean.Volunteer_exp;
import com.project.demo.mapper.Volunteer_expMapper;
import com.project.demo.service.Volunteer_expService;
import com.project.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Volunteer_expServiceImpl extends ServiceImpl<Volunteer_expMapper, Volunteer_exp> implements Volunteer_expService {
    @Autowired
    private Volunteer_expMapper volunteer_expMapper;
    @Override
    public Object selectByvolu_id(Integer volu_id) {
        Volunteer_exp volunteer_exp;
        volunteer_exp = volunteer_expMapper.selectByvolu_id(volu_id);
        return ResultUtil.success(volunteer_exp,20,"查询成功");
    }

    @Override
    public Object deleteByvolu_id(Integer volu_id) {
        volunteer_expMapper.deleteByvolu_id(volu_id);
        return ResultUtil.success(null,20,"删除成功");
    }
}
