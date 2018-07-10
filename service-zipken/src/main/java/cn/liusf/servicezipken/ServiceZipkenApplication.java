package cn.liusf.servicezipken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableZipkinServer
public class ServiceZipkenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZipkenApplication.class, args);
    }
}
