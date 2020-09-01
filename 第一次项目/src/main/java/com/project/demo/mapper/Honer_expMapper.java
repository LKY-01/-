package com.project.demo.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo.Bean.Honer_exp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Honer_expMapper extends BaseMapper<Honer_exp> {
    Honer_exp selectByhoner_id(Integer honer_id);
    void deleteByhoner_id(Integer honer_id);
}
