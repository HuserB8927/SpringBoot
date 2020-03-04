package com.benjaminhalasz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benjaminhalasz.domain.Kids;
import com.benjaminhalasz.domain.Parents;
import com.benjaminhalasz.repository.KidsRepo;
import com.benjaminhalasz.repository.ParentsRepo;
import com.benjaminhalasz.service.KidsService;
import com.benjaminhalasz.service.ParentsService;



@Controller
public class HomeController {
	
    KidsRepo kidsRepository;
    ParentsRepo parentsRepository;
    
    private KidsService kidsService;
    private ParentsService parentsService;

    @Autowired
    public void setKidsRepository(KidsRepo kidsRepository) {
        this.kidsRepository = kidsRepository;
    }
    @Autowired
    public void setParentsRepository(ParentsRepo parentsRepository) {
        this.parentsRepository = parentsRepository;
    }
    
    @RequestMapping("/")
    private String findParents(Parents parentsName, Model model) {
        Parents parents = parentsService.findParents(parentsName.getFirstName());
        List<Kids> kids = kidsService.getKids(parentsName.getFirstName());

        model.addAttribute("parents", parents.getFirstName());
        model.addAttribute("children", kids);
        // render to appropriate view
        return "home";
    }
}