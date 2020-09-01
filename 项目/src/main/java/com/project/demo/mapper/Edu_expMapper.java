package com.project.demo.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo.Bean.Edu_exp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Edu_expMapper extends BaseMapper<Edu_exp> {
    Edu_exp selectByedu_exp_id(Integer edu_exp_id);
    void deleteByedu_exp_id(Integer edu_exp_id);
}
