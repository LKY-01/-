package com.project.demo.controller;
import com.project.demo.service.Honer_expService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Honor_expController {
    @Autowired
    private Honer_expService honer_expService;
    @RequestMapping("/show3")
    public Object string(){
        return "Honor_exp测试成功";
    }
    @RequestMapping("/honor_exp/delete/{honer_id}")
    public Object deleteByhoner_id(@PathVariable Integer honer_id){
        return honer_expService.deleteByhoner_id(honer_id);
    }

    @RequestMapping("/honor_exp/select/{honer_id}")
    public Object selectByhoner_id(@PathVariable Integer honer_id) {
        return honer_expService.selectByhoner_id(honer_id);
    }
}

