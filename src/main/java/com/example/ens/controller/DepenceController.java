package com.example.ens.controller;

import com.example.ens.entities.Depence;
import com.example.ens.reposetory.DepenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/Depence")
public class DepenceController {

    @Autowired
    private DepenceRepo depenceRepo;
    //Creation d'un depence d'argent
    @PostMapping
    public Depence createDepence(@RequestBody Depence depence) {
        return depenceRepo.save(depence);
    }

    //chercher une source par id
    @GetMapping("/AllDepence")
    public List<Depence> getAllDepences() {
        return depenceRepo.findAll();
    }
    @GetMapping("/{id}")
    public Depence getDepences(@PathVariable(name = "id") Long id) {
        return depenceRepo.findById(id).orElse(null);
    }

    // Mettre à jour une source existant
    @PutMapping("/{id}")
    public Depence updateDepence(@RequestBody Depence depence) {
        /*Depence depence = depenceRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        depence.setRefDepence(detailsDepence.getRefDepence());
        depence.setDateDepence(detailsDepence.getDateDepence());
        depence.setMontantDepence(detailsDepence.getMontantDepence());*/
        return depenceRepo.save(depence);
    }

    // Supprimer un Depence existant
    @DeleteMapping("/{id}")
    public void deleteDepence(@PathVariable Long id) {
        depenceRepo.deleteById(id);
    }
}
