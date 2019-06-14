package br.com.alexandre.servidoreureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServidoreurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServidoreurekaApplication.class, args);
    }

}
