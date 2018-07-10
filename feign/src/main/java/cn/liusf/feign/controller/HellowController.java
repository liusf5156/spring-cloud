package cn.liusf.feign.controller;

import cn.liusf.feign.service.HellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {


    @Autowired
    private HellowService hellowService;


    @RequestMapping("hell")
    public String hellow(@RequestParam String name) {
        return hellowService.sayHellow(name);
    }
}
