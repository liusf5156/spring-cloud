package cn.liusf.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HellowService {
    @Override
    public String sayHellow(String name) {
        return "sorry  熔断器报错"+name;
    }
}
