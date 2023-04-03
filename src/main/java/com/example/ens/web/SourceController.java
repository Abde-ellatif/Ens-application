package com.example.ens.web;

import com.example.ens.dto.SourceDTO;
import com.example.ens.exception.SourceException;
import com.example.ens.service.IBourceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/Souce")
public class SourceController {
    IBourceService service;


    @PostMapping()
    public SourceDTO saveSource(@RequestBody SourceDTO sourceDTO)throws SourceException {
        return service.saveSource(sourceDTO);
    }
    @PutMapping("/id")
    public SourceDTO updateSource(@PathVariable Long id,@RequestBody SourceDTO sourceDTO) throws SourceException{
        sourceDTO.setId(id);
        return service.updateSource(sourceDTO);
    }
    @GetMapping("/id")
    public SourceDTO getSourceById(@PathVariable Long id) throws SourceException{
        return service.getSourceById(id);
    }
    @GetMapping("AllSource")
    public List<SourceDTO> getAllSource(){
        return service.getAllSource();
    }
    @DeleteMapping("/id")
    public void deletSource(@PathVariable Long id) throws SourceException{
        service.deletSource(id);
    }

}
