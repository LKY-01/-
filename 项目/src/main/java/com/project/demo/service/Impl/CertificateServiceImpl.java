package com.project.demo.service.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.demo.Bean.Certificate;
import com.project.demo.mapper.CertificateMapper;
import com.project.demo.service.CertificateService;
import com.project.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CertificateServiceImpl extends ServiceImpl<CertificateMapper,Certificate> implements CertificateService{
    @Autowired
    private CertificateMapper certificateMapper;
    @Override
    public Object deleteByCertid(Integer cert_id) {
        certificateMapper.deleteByCertid(cert_id);
        return ResultUtil.success(null,20,"成功");
    }

    @Override
    public Object selectByCertid(Integer cert_id) {
        Certificate certificate;
        certificate=certificateMapper.selectByCertid(cert_id);
        return ResultUtil.success(certificate,20,"成功");
    }

    @Override
    public Object addBycert_id(Certificate certificate) {
        certificateMapper.addBycert_id(certificate);
        return ResultUtil.success(null,20,"成功");
    }

    @Override
    public Object changeBycert_id(Certificate certificate) {
        certificateMapper.changeBycert_id(certificate);
        return ResultUtil.success(null,20,"成功");
    }
}
