package com.project.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.demo.Bean.Practice;

public interface PracticeService extends IService<Practice> {
    Object selectBypractice_id(Integer practice_id);
    Object deleteBypractice_id(Integer practice_id);
}
