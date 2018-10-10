package me.xueyao.springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class SpringBootHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloApplication.class, args);
    }
}
