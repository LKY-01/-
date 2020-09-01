package com.project.demo.controller;
import com.project.demo.Bean.User;
import com.project.demo.mapper.Volunteer_expMapper;
import com.project.demo.service.Volunteer_expService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Volunteer_expController{
        @Autowired
        private Volunteer_expService volunteer_expService;
        @RequestMapping("/show7")
        public Object string(){
            return "Volunteer_exp测试成功";
        }
        @RequestMapping("/volunteer_exp/delete/{volu_id}")
        public Object deleteByID(@PathVariable int volu_id) {
            return volunteer_expService.deleteByvolu_id(volu_id);
        }
        @RequestMapping("/volunteer_exp/select/{volu_id}")
        public Object selectByID(@PathVariable int volu_id){
            return volunteer_expService.selectByvolu_id(volu_id);
        }

}
