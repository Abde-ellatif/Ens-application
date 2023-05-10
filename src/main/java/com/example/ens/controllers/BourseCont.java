package com.example.ens.controllers;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.SourceDTO;
import com.example.ens.dto.req.BourseReq;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.SourceException;
import com.example.ens.service.BourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("")
public class BourseCont {
    @Autowired
    BourseService bourseService;
    //create
    @GetMapping("/createBourse")
    public String createBourse(ModelMap modelMap){
        List<SourceDTO> listSource = bourseService.getAllSource();
        System.out.println(listSource);
        modelMap.addAttribute("listesource",listSource);
        modelMap.addAttribute("source",new SourceDTO());
        return "bourse/createBourse";
    }
    //save
    @RequestMapping("/saveBourse")
    public String saveBourse(@ModelAttribute("bourse") BourseReq req ) throws SourceException {
        BourseDTO memo = bourseService.saveBourse(req);
        return "bourse/createBourse";
    }
    //update
    @RequestMapping("/updateBourse")
    public String updateBourse(@ModelAttribute("bourse") BourseDTO bourse, ModelMap modelMap) throws  BourseException {
        BourseDTO memo = bourseService.updateBourse(bourse);
        List<BourseDTO> bourseController = bourseService.getAllBourse();
        modelMap.addAttribute("bourse",bourseController);
        return "bourse/bourseListe";

    }

    //show for edit

    @RequestMapping("/showBourse")
    public String showBourse(@RequestParam("id") Long id, ModelMap modelMap) throws BourseException {

        List<SourceDTO> listSource = bourseService.getAllSource();
        modelMap.addAttribute("listesource",listSource);
        modelMap.addAttribute("source",new SourceDTO());
        BourseDTO bourseController = bourseService.getBourseById(id);
        modelMap.addAttribute("bourse", bourseController);
        return "bourse/editBourse";
    }


    //lister
    @RequestMapping("/allBourse")
    public String allBourse(ModelMap modelMap){
        List<BourseDTO> bourseController = bourseService.getAllBourse();
        modelMap.addAttribute("bourse",bourseController);
        return "bourse/bourseListe";
    }

    //delete
    @RequestMapping("/deleteBourse")
    public String deleteBourse(@RequestParam("id") Long id, ModelMap modelMap) throws BourseException {
        bourseService.deletBourse(id);
        List<BourseDTO> bourseController = bourseService.getAllBourse();
        modelMap.addAttribute("bourse",bourseController);
        return "bourse/bourseListe";
    }


}