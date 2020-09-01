package com.project.demo.controller;
import com.project.demo.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PracticeController  {
    @Autowired
    private PracticeService practiceService;
    @RequestMapping("/show4")
    public Object string(){
        return "Practice测试成功";
    }
    @RequestMapping("/practice/delete/{practice_id}")
    public Object deleteBypractice_id(@PathVariable Integer practice_id){
        return practiceService.deleteBypractice_id(practice_id);
    }
    @RequestMapping("/practice/select/{practice_id}")
    public Object selectBypractice_id(@PathVariable Integer practice_id) {
        return practiceService.selectBypractice_id(practice_id);
    }
}
