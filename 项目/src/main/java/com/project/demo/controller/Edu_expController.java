package com.project.demo.controller;
import com.project.demo.service.Edu_expService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Edu_expController {
    @Autowired
    private Edu_expService edu_expService;
    @RequestMapping("/show2")
    public Object string(){
        return "Edu_exp测试成功";
    }
    @RequestMapping("/Edu_exp/delete/{edu_exp_id}")
    public Object deleteByedu_exp_id(@PathVariable int edu_exp_id) {
        return edu_expService.deleteByedu_exp_id(edu_exp_id);
    }
    @RequestMapping("/Edu_exp/select/{edu_exp_id}")
    public Object selectByedu_exp_id(@PathVariable int edu_exp_id){
        return edu_expService.selectByedu_exp_id(edu_exp_id);
    }
}
