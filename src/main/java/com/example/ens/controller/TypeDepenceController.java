package com.example.ens.controller;

import com.example.ens.entities.Source;
import com.example.ens.entities.TypeDepence;
import com.example.ens.reposetory.SourceRepo;
import com.example.ens.reposetory.TypeDepenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TypeDepence")
public class TypeDepenceController {
    @Autowired

    private TypeDepenceRepo typeDepenceRepo;

    @PostMapping()
    public TypeDepence save(@RequestBody TypeDepence typeDepence){
        return typeDepenceRepo.save(typeDepence);
    }
    @PutMapping()
    public TypeDepence update(@RequestBody TypeDepence typeDepence){
        return typeDepenceRepo.save(typeDepence);
    }
    @GetMapping("/AllSource")
    public List<TypeDepence> getAllTypeDepence()
    {
        return typeDepenceRepo.findAll();
    }
    @GetMapping("/{id}")
    public TypeDepence getTypeDepence(@PathVariable(name = "id") Long id)
    {
        return typeDepenceRepo.findById(id).orElse(null);
    }
    @DeleteMapping("{id}")
    public void delletTypeDepence(@PathVariable(name = "id") Long id){
        typeDepenceRepo.deleteById(id);
    }
}
