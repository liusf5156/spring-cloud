package cn.liusf.clientribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HellowService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://CLIENT-PRIVODE/hello?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,断路器error!";
    }

}
