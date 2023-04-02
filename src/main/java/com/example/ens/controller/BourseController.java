package com.example.ens.controller;

import com.example.ens.entities.Bourse;
import com.example.ens.exception.BourseException;
import com.example.ens.reposetory.BourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Bourse")
public class BourseController  {
    @Autowired
    private BourseRepo bourseRepo;
    //Creation d'une bourse d'argent
    @PostMapping()
    public Bourse createBourse(@RequestBody Bourse bourse) {
        return bourseRepo.save(bourse);
    }
    //chercher une source par id
    @GetMapping("/AllBourse")
    public List<Bourse> getAllBourse() {
        return bourseRepo.findAll();
    }

    @GetMapping("/{id}")
    public Bourse getBourseById(@PathVariable(name = "id") Long id) throws BourseException {
        return bourseRepo.findById(id).orElse(null);
    }

    // Mettre à jour une source existant
    @PutMapping()
    public Bourse updateBourse( @RequestBody Bourse bourse) {
        /*Bourse source = bourseRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        source.setRefBourse(detailsSource.getRefBourse());
        source.setDateBourse(detailsSource.getDateBourse());
        source.setMontantBourse(detailsSource.getMontantBourse());*/
        return bourseRepo.save(bourse);
    }



    // Supprimer un employé existant
    @DeleteMapping("/{id}")
    public void deleteBourse(@PathVariable Long id) {
        bourseRepo.deleteById(id);
    }
}
