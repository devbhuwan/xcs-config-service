package xcs.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XcsConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcsConfigServiceApplication.class, args);
    }
}
