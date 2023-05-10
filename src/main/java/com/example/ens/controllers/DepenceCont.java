package com.example.ens.controllers;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.DepenceDTO;
import com.example.ens.dto.SourceDTO;
import com.example.ens.dto.TypeDepenceDTO;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.DepenceException;
import com.example.ens.service.BourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")

public class DepenceCont {

    @Autowired
    BourseService bourseService;
    //create
    @GetMapping("/createDepence")
    public String createDepence(ModelMap modelMap){
        List<TypeDepenceDTO> listTypeDepence = bourseService.getAllTypeDepence();
        List<BourseDTO> listBourse = bourseService.getAllBourse();
        modelMap.addAttribute("listTypeDepence",listTypeDepence);
        modelMap.addAttribute("listBourse",listBourse);
        modelMap.addAttribute("typedep",new TypeDepenceDTO());
        modelMap.addAttribute("listeBourse",new BourseDTO());
        return "depence/createDepence";
    }
    //save
    @RequestMapping("/saveDepence")
    public String saveDepence( DepenceDTO depenceDTO, ModelMap modelMap) {
        DepenceDTO memo = bourseService.saveDepence(depenceDTO);
        return "depence/createDepence";
    }
    //update
    @RequestMapping("/updateDepence")
    public String updateDepence(@ModelAttribute("depence") DepenceDTO depenceDTO, ModelMap modelMap) throws DepenceException {
        DepenceDTO memo = bourseService.updateDepence(depenceDTO);
        List<DepenceDTO> depenceController = bourseService.getAllDepence();
        modelMap.addAttribute("depence",depenceController);
        return "depence/depenceListe";

    }

    //show for edit

    @RequestMapping("/showDepence")
    public String showDepence(@RequestParam("id") Long id, ModelMap modelMap) throws DepenceException {
        DepenceDTO depenceController = bourseService.getDepenceById(id);
        modelMap.addAttribute("depence", depenceController);
        return "depence/editeDepence";
    }


    //lister
    @RequestMapping("/allDepence")
    public String allDepence(ModelMap modelMap){
        List<DepenceDTO> depenceController = bourseService.getAllDepence();
        modelMap.addAttribute("depence",depenceController);
        return "depence/depenceListe";
    }

    //delete
    @RequestMapping("/deleteDepence")
    public String deleteDepence(@RequestParam("id") Long id, ModelMap modelMap) throws DepenceException {
        bourseService.deletDepence(id);
        List<DepenceDTO> depenceController = bourseService.getAllDepence();
        modelMap.addAttribute("depence",depenceController);
        return "depence/depenceListe";
    }


}
