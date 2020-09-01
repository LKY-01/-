package com.project.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.demo.Bean.Honer_exp;

public interface Honer_expService extends IService<Honer_exp> {
    Object selectByhoner_id(Integer honer_id);
    Object deleteByhoner_id(Integer honer_id);
}
