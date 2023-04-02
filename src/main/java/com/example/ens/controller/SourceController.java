package com.example.ens.controller;

import com.example.ens.entities.Source;
import com.example.ens.reposetory.SourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Source")
public class SourceController {
    @Autowired

    private SourceRepo sourceRepo;

    @PostMapping()
    public Source save(@RequestBody Source source){
        return sourceRepo.save(source);
    }
    @PutMapping()
    public Source update(@RequestBody Source source){
        return sourceRepo.save(source);
    }
    @GetMapping("/AllSource")
    public List<Source> getAllSource()
    {
        return sourceRepo.findAll();
    }
    @GetMapping("/{id}")
    public Source getSource(@PathVariable(name = "id") Long id)
    {
        return sourceRepo.findById(id).orElse(null);
    }
    @DeleteMapping("{id}")
    public void delletSource(@PathVariable(name = "id") Long id){
        sourceRepo.deleteById(id);
    }


}
