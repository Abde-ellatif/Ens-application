package com.example.ens.controller;

import com.example.ens.entities.Bourse;
import com.example.ens.reposetory.BourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/Bourse")
public class BourseController {
    @Autowired
    private BourseRepo bourseRepo;
    //Creation d'une bourse d'argent
    @PostMapping(value = "/Bourse")
    public Bourse createSource(@RequestBody Bourse source) {
        return bourseRepo.save(source);
    }
    //chercher une source par id
    @GetMapping("/AllBourse")
    public List<Bourse> getAllSouces() {
        return bourseRepo.findAll();
    }

    @GetMapping("/Bourse/{id}")
    public Bourse getAllSouces(@PathVariable Long id , @RequestBody Bourse bourse) {
        return bourseRepo.findById(id).orElse(null);
    }

    // Mettre à jour une source existant
    @PutMapping("Bourse/{id}")
    public Bourse updateSource(@PathVariable Long id, @RequestBody Bourse bourse) {
        /*Bourse source = bourseRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        source.setRefBourse(detailsSource.getRefBourse());
        source.setDateBourse(detailsSource.getDateBourse());
        source.setMontantBourse(detailsSource.getMontantBourse());*/
        return bourseRepo.save(bourse);
    }



    // Supprimer un employé existant
    @DeleteMapping("Bourse/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        bourseRepo.deleteById(id);
    }
}
