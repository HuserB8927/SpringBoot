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
	
    private KidsService kidsService;
    
    private ParentsService parentsService;

  
    @Autowired
    public void setParentsService(ParentsService parentsService) {
    	this.parentsService = parentsService;
    }
    @Autowired
    public void setKidsService(KidsService kidsService) {
    	this.kidsService = kidsService;
    }
    
    @RequestMapping("/")
    private String findParents(Parents parentsName, Model model) {
        Parents parents = parentsService.findParents(parentsName.getLastName());
        List<Kids> kids = kidsService.getKids(parentsName.getFirstName());

        model.addAttribute("pageTitle", "This is the main page title");
        model.addAttribute("parent", parents);
        model.addAttribute("children", kids);
        return "home";
    }

    @RequestMapping("/lastName/{lastName}")
    private String searchForParents(@PathVariable(value="lastName") String lastName, Model model) throws Exception {
//    	if(lastName == null) {
//    		throw new IllegalArgumentException("We dont have Parent with this name");
    	
    	model.addAttribute("home", kidsService.getSpecificKid(lastName));
    
    	

		return "home";
    	
    }
}