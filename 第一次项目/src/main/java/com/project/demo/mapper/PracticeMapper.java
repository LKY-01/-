package com.project.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo.Bean.Practice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PracticeMapper extends BaseMapper<Practice> {
    Practice selectBypractice_id(Integer project_exp_id);
    void deleteBypractice_id(Integer project_exp_id);
}
