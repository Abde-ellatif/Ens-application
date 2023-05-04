package com.example.ens.controllers;

import com.example.ens.dto.SourceDTO;
import com.example.ens.entities.Source;
import com.example.ens.exception.SourceException;
import com.example.ens.service.BourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("")
public class SourceCont {
    @Autowired
    BourseService bourseService;
    @RequestMapping("/createSource")
    public String createSource(){

        return "source/CreateSource";
    }
    @GetMapping()
    public String index(){

        return "Index";
    }

    @RequestMapping("/index")
    public String menu(){
        return "Index";
    }
    @RequestMapping("/saveSource")
    public String saveSource(@ModelAttribute("source") SourceDTO source, ModelMap modelMap) {


        SourceDTO memo = bourseService.saveSource(source);
        String messageSucces="La source avec l'id "+memo.getId()+" est ajouter avec succes";
        modelMap.addAttribute("messageJsp",messageSucces);
        return "source/CreateSource";

    }


    @RequestMapping("/updateSource")
    public String updateSource(@ModelAttribute("source") SourceDTO source, ModelMap modelMap) throws SourceException {
        SourceDTO memo = bourseService.updateSource(source);
        List<SourceDTO> sourceController = bourseService.getAllSource();
        modelMap.addAttribute("sourceJsp",sourceController);
        return "SourceListe";

    }


    @RequestMapping("/allSource")
    public String allSource(ModelMap modelMap){
        List<SourceDTO> sourceController = bourseService.getAllSource();
        modelMap.addAttribute("sourceJsp",sourceController);
        return "SourceListe";
    }
    @RequestMapping("/deleteSource")
    public String deleteSource(@RequestParam("id") Long id, ModelMap modelMap) throws SourceException {
        bourseService.deleteSource(id);
        List<SourceDTO> sourceController = bourseService.getAllSource();
        modelMap.addAttribute("sourceJsp",sourceController);
        return "SourceListe";
    }


    @RequestMapping("/showSource")
    public String showSource(@RequestParam("id") Long id, ModelMap modelMap) throws SourceException {
        SourceDTO sourceController = bourseService.getSourceById(id);
        modelMap.addAttribute("sourceJsp", sourceController);
        return "EditeSource";
    }

}
