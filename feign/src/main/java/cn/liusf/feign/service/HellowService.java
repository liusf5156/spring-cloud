package cn.liusf.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-privode" ,fallback = SchedualServiceHiHystric.class)
public interface HellowService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHellow(@RequestParam(value = "name") String name);

}
