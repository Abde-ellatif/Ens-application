package com.example.ens;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class EnsApplication {


    public static void main(String[] args) {
        SpringApplication.run(EnsApplication.class, args);

    }


}
