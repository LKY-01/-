package com.project.demo.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo.Bean.Volunteer_exp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Volunteer_expMapper extends BaseMapper<Volunteer_exp> {
    Volunteer_exp selectByvolu_id(Integer volu_id);
    void deleteByvolu_id(Integer volu_id);
}
