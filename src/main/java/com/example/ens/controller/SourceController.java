package com.example.ens.controller;

import com.example.ens.entities.Source;
import com.example.ens.reposetory.SourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Source")
public class SourceController {
    @Autowired

    private SourceRepo sourceRepo;

    @PostMapping(value = "/Source")
    public Source save(@RequestBody Source source){
        return sourceRepo.save(source);
    }

}
