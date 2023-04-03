package com.example.ens.web;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.DepenceDTO;
import com.example.ens.dto.req.BourseReq;
import com.example.ens.dto.req.DepenceReq;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.DepenceException;
import com.example.ens.exception.SourceException;
import com.example.ens.service.IBourceService;
import jakarta.websocket.DecodeException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/Depence")
public class DepenceController {
    IBourceService service;


    @PostMapping()
    public DepenceDTO saveDepence(@RequestBody DepenceReq req)throws DecodeException {
        return service.saveDepence(req);
    }
    @PutMapping("/'{id}")
    public DepenceDTO updateDepence(@PathVariable(name = "id") Long id,@RequestBody DepenceDTO depenceDTO) throws  DepenceException {
        depenceDTO.setId(id);
        return service.updateDepence(depenceDTO);
    }
    @GetMapping("/{id}")
    public DepenceDTO getDepenceById(@PathVariable(name = "id") Long id) throws DepenceException{
        return service.getDepenceById(id);
    }
    @GetMapping("AllDepence")
    public List<DepenceDTO> getAllDepence(){
        return service.getAllDepence();
    }
    @DeleteMapping("/{id}")
    public void deletDepence(@PathVariable(name = "id") Long idDeprnce) throws DepenceException{
        service.deletDepence(idDeprnce);
    }

    /*@GetMapping("/source/id")
    public List<DepenceDTO> getAllDepenceByBourse(@PathVariable Long id) throws SourceException, DepenceException {
        return (List<DepenceDTO>) service.getAllDepenceByBourse(id);
    }*/
}
