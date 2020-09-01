package com.project.demo.controller;
import com.project.demo.Bean.Certificate;
import com.project.demo.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController {

    @Autowired
    private CertificateService certificateService;
    @RequestMapping("/show1")
    public Object string(){
        return "Certificate测试成功";
    }
    @RequestMapping("/certificate/delete/{cert_id}")
    public Object deleteBycertid(@PathVariable int cert_id) {
        return certificateService.deleteByCertid(cert_id);
    }
    @RequestMapping("/certificate/select/{cert_id}")
    public Object selectBycertid(@PathVariable int cert_id){
        return certificateService.selectByCertid(cert_id);
    }
    @RequestMapping("/certificate/add")
    public Object addBycert_id(Certificate certificate){
        return certificateService.addBycert_id(certificate);
    }

}