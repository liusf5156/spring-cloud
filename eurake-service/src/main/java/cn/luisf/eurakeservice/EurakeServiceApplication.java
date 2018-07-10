package cn.luisf.eurakeservice;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurakeServiceApplication.class).web(true).run(args);
    }
}
