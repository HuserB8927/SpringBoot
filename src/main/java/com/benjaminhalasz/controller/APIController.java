package com.benjaminhalasz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benjaminhalasz.domain.Kids;
import com.benjaminhalasz.service.KidsService;

@RestController
public class APIController {
	
	private KidsService kidsService;
	
	@Autowired
    public void setKidsService(KidsService kidsService) {
    	this.kidsService = kidsService;
    }
	@RequestMapping("/kids/{lname}") 
	public List<Kids> searchKidsByParentsLastName(@PathVariable(value="lname") String lname) {
		return kidsService.getKidsByParentsLastName(lname);
		
	}
//	@RequestMapping("/kids/{fname}") 
//	public List<Kids> searchKidsByParentsFirstName(@PathVariable(value="fname") String fname) {
//		return kidsService.getKidsByParentsFirstName(fname);
//		
//	}

}
