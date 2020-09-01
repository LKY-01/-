package com.project.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.demo.Bean.Honer_exp;
import com.project.demo.mapper.Honer_expMapper;
import com.project.demo.service.Honer_expService;
import com.project.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Honer_expServiceImpl extends ServiceImpl<Honer_expMapper, Honer_exp> implements Honer_expService {
    @Autowired
    private Honer_expMapper honer_expMapper;
    @Override
    public Object selectByhoner_id(Integer honer_id) {
        Honer_exp honer_exp;
        honer_exp = honer_expMapper.selectByhoner_id(honer_id);
        return ResultUtil.success(honer_exp,200,"查询成功");
    }

    @Override
    public Object deleteByhoner_id(Integer honer_id) {
        honer_expMapper.deleteByhoner_id(honer_id);
        return ResultUtil.success(null,200,"删除成功");
    }
}
