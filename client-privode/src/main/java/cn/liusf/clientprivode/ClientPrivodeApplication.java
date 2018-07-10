package cn.liusf.clientprivode;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientPrivodeApplication {

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "Hello :"+ name;
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientPrivodeApplication.class).web(true).run(args);
    }
}
