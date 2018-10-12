package com.zhanghf;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class ConsumerEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerEmployeeApplication.class, args);
	}
}
