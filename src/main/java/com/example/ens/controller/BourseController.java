package com.example.ens.controller;

import com.example.ens.entities.Source;
import com.example.ens.reposetory.SourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/Source")
public class SourceController {
    @Autowired
    private SourceRepo sourceRepo;
    //Creation d'une source d'argent
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Source createSource(@RequestBody Source source) {
        return sourceRepo.save(source);
    }
    //chercher une source par id
    @GetMapping("/AllSource")
    public List<Source> getAllSouces() {
        return sourceRepo.findAll();
    }

    // Mettre à jour une source existant
    @PutMapping("/{id}")
    public Source updateSource(@PathVariable Long id, @RequestBody Source detailsSource) {
        Source source = sourceRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        source.setRefSource(detailsSource.getRefSource());
        source.setDateSource(detailsSource.getDateSource());
        source.setMontantSource(detailsSource.getMontantSource());
        return sourceRepo.save(source);
    }



    // Supprimer un employé existant
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Long id) {
        sourceRepo.deleteById(id);
    }
}
