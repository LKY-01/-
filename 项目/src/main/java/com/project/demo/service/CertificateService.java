package com.project.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.demo.Bean.Certificate;


public interface CertificateService extends IService<Certificate> {
    Object deleteByCertid(Integer cert_id);
    Object selectByCertid(Integer cert_id);
    Object addBycert_id(Certificate certificate);
    Object changeBycert_id(Certificate certificate);
}
