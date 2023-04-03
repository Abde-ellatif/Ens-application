package com.example.ens.web;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.req.BourseReq;
import com.example.ens.entities.Bourse;
//import com.example.ens.controller.*;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.SourceException;
import com.example.ens.service.IBourceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/Bourse")
public class BourseController {

    IBourceService service;


    @PostMapping()
    public BourseDTO saveBourse(@RequestBody BourseReq req)throws BourseException{
            return service.saveBourse(req);
    }
    @PutMapping("/{id}")
    public BourseDTO updateBourse(@PathVariable(name = "id") Long id,@RequestBody BourseDTO bourseDTO) throws BourseException{
        bourseDTO.setId(id);
        return service.updateBourse(bourseDTO);
    }
    @GetMapping("/{id}")
    public BourseDTO getBourseById(@PathVariable(name = "id") Long id) throws BourseException{
        return service.getBourseById(id);
    }
    @GetMapping("AllBourse")
    public List<BourseDTO> getAllBourse(){
        return service.getAllBourse();
    }
    @DeleteMapping("/{id}")
    public void deletBourse(@PathVariable(name = "id") Long id) throws BourseException{
         service.deletBourse(id);
    }

    /*@GetMapping("/source/id")
    public List<BourseDTO> getAllBourseBySource(@PathVariable Long id) throws SourceException, BourseException {
        return (List<BourseDTO>) service.getAllBourseBySource(id);
    }*/



}


