package com.sparta.springhanghae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 데이터 변동이 있으면 JPA가 반영해줌
@SpringBootApplication
public class SpringhanghaeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringhanghaeApplication.class, args);
    }

}
