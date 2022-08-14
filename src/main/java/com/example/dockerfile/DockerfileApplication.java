package com.example.dockerfile;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.dockerfile.db")
public class DockerfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerfileApplication.class, args);
    }

}
