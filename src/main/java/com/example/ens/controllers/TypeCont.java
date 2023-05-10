package com.example.ens.controllers;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.SourceDTO;
import com.example.ens.dto.TypeDepenceDTO;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.TypeDepenceException;
import com.example.ens.service.BourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
@RequestMapping("")
@AllArgsConstructor
public class TypeCont {
    BourseService bourseService;

    @RequestMapping("/createTypeDepence")
    public String createType(){

        return "typeDepence/createType";
    }
    //save
    @RequestMapping("/saveType")
    public String saveType( TypeDepenceDTO typeDepenceDTO, ModelMap modelMap) {
        TypeDepenceDTO memo = bourseService.saveTypeDepence(typeDepenceDTO);
        return "typeDepence/createType";
    }
    //update
    @RequestMapping("/updateType")
    public String updateType(@ModelAttribute("typeDepence") TypeDepenceDTO typeDepenceDTO, ModelMap modelMap) throws TypeDepenceException {
        TypeDepenceDTO memo = bourseService.updateTypeDepence(typeDepenceDTO);
        List<TypeDepenceDTO> typeDepenceController = bourseService.getAllTypeDepence();
        modelMap.addAttribute("typeDepence",typeDepenceController);
        return "typeDepence/typeListe";

    }

    //show for edit

    @RequestMapping("/showType")
    public String showType(@RequestParam("id") Long id, ModelMap modelMap) throws TypeDepenceException {
        TypeDepenceDTO bourseController = bourseService.getTypeDepenceById(id);
        modelMap.addAttribute("typeDepence", bourseController);
        return "typeDepence/editeType";
    }


    //lister
    @RequestMapping("/allType")
    public String allType(ModelMap modelMap){
        List<TypeDepenceDTO> typeController = bourseService.getAllTypeDepence();
        modelMap.addAttribute("typeDepence",typeController);
        return "typeDepence/typeListe";
    }

    //delete
    @RequestMapping("/deleteType")
    public String deleteType(@RequestParam("id") Long id, ModelMap modelMap) throws TypeDepenceException {
        bourseService.deletTypeDepence(id);
        List<TypeDepenceDTO> typeDepenceController = bourseService.getAllTypeDepence();
        modelMap.addAttribute("typeDepence",typeDepenceController);
        return "typeDepence/typeListe";
    }

}
