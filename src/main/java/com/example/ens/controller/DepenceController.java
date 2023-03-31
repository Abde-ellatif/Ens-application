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
    @ResponseStatus(HttpStatus.CREATED)
    public Depence createDepence(@RequestBody Depence depence) {
        return depenceRepo.save(depence);
    }

    //chercher une source par id
    @GetMapping("/AllDepence")
    public List<Depence> getAllDepences() {
        return depenceRepo.findAll();
    }

    // Mettre à jour une source existant
    @PutMapping("/{id}")
    public Depence updateDepence(@PathVariable Long id, @RequestBody Depence detailsDepence) {
        Depence depence = depenceRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        depence.setRefDepence(detailsDepence.getRefDepence());
        depence.setDateDepence(detailsDepence.getDateDepence());
        depence.setMontantDepence(detailsDepence.getMontantDepence());
        return depenceRepo.save(depence);
    }

    // Supprimer un Depence existant
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDepence(@PathVariable Long id) {
        depenceRepo.deleteById(id);
    }
}
