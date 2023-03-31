package com.example.ens.controller;

import com.example.ens.entities.Bourse;
import com.example.ens.reposetory.BourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/Source")
public class BourseController {
    @Autowired
    private BourseRepo bourseRepo;
    //Creation d'une source d'argent
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bourse createSource(@RequestBody Bourse source) {
        return bourseRepo.save(source);
    }
    //chercher une source par id
    @GetMapping("/AllSource")
    public List<Bourse> getAllSouces() {
        return bourseRepo.findAll();
    }

    // Mettre à jour une source existant
    @PutMapping("/{id}")
    public Bourse updateSource(@PathVariable Long id, @RequestBody Bourse detailsSource) {
        Bourse source = bourseRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        source.setRefBourse(detailsSource.getRefBourse());
        source.setDateBourse(detailsSource.getDateBourse());
        source.setMontantBourse(detailsSource.getMontantBourse());
        return bourseRepo.save(source);
    }



    // Supprimer un employé existant
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Long id) {
        bourseRepo.deleteById(id);
    }
}
