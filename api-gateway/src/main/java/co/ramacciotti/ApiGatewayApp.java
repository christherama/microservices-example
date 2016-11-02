package co.ramacciotti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableFeignClients
@EnableZuulProxy
@EnableCircuitBreaker
@EnableEurekaClient
public class ApiGatewayApp {
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApp.class, args);
	}
}
