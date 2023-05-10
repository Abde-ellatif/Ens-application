package com.example.ens.controllers;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.DepenceDTO;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.DepenceException;
import com.example.ens.service.BourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CalculeCont {
    BourseService bourseService;

    @RequestMapping("/calcule")
    public String calcule(ModelMap modelMap , BourseDTO bourseDTO, DepenceDTO depenceDTO) throws BourseException, DepenceException {
        double sumBourse = bourseService.sumBourse();
        double sumDepence = bourseService.sumDepence();
        double solde = bourseService.solde();
        modelMap.addAttribute("sumBourse", sumBourse);
        modelMap.addAttribute("sumDepence", sumDepence);
        modelMap.addAttribute("solde", solde);
        return "/solde";
    }
}
