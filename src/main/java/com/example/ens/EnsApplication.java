package com.example.ens;

import com.example.ens.reposetory.BourseRepo;
import com.example.ens.reposetory.DepenceRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController


@AllArgsConstructor
public class EnsApplication {


    BourseRepo bourseRepo;
    DepenceRepo depenceRepo;
    public static void main(String[] args) {

        SpringApplication.run(EnsApplication.class, args);

    }



}
