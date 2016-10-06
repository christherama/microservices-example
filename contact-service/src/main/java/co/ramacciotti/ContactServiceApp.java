package co.ramacciotti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContactServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ContactServiceApp.class, args);
    }
}
