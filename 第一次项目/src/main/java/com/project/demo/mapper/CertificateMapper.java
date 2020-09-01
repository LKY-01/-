package com.project.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo.Bean.Certificate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CertificateMapper extends BaseMapper<Certificate> {
    void deleteByCertid(Integer cert_id);
    Certificate selectByCertid(Integer cert_id);
    void addBycert_id(Certificate certificate);
    void changeBycert_id(Certificate certificate);
}
