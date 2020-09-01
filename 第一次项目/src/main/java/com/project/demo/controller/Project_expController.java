package com.project.demo.controller;

import com.project.demo.Bean.User;
import com.project.demo.service.Project_expService;
import com.project.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project_expController  {
    @Autowired
    private Project_expService project_expService;

    @RequestMapping("/show5")
    public Object string(){
        return "Project_exp测试成功";
    }
    @RequestMapping("/Project_exp/delete/{project_exp_id}")
    public Object deleteByID(@PathVariable int project_exp_id) {
        return project_expService.deleteByproject_exp_id(project_exp_id);
    }

    @RequestMapping("/Project_exp/select/{project_exp_id}")
    public Object selectByID(@PathVariable int project_exp_id){
        return project_expService.selectByproject_exp_id(project_exp_id);
    }

}
