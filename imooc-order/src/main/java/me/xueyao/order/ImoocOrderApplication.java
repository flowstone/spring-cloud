package me.xueyao.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ImoocOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoocOrderApplication.class, args);
	}
}
