package com.project.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.demo.Bean.Practice;
import com.project.demo.mapper.PracticeMapper;
import com.project.demo.service.PracticeService;
import com.project.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticeServiceImpl extends ServiceImpl<PracticeMapper, Practice> implements PracticeService {
    @Autowired
    private PracticeMapper practiceMapper;
    @Override
    public Object selectBypractice_id(Integer practice_id) {
        Practice practice;
        practice = practiceMapper.selectBypractice_id(practice_id);
        return ResultUtil.success(practice,200,"查询成功");
    }

    @Override
    public Object deleteBypractice_id(Integer practice_id) {
        practiceMapper.deleteBypractice_id(practice_id);
        return ResultUtil.success(null,200,"删除成功");
    }
}
