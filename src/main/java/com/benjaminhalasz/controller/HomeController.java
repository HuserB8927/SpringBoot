package com.benjaminhalasz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.benjaminhalasz.repository.KidsRepo;
import com.benjaminhalasz.repository.ParentsRepo;



@Controller
public class HomeController {
	
    KidsRepo kidsRepository;
    ParentsRepo parentsRepository;

    @Autowired
    public void setKidsRepository(KidsRepo kidsRepository) {
        this.kidsRepository = kidsRepository;
    }
    @Autowired
	public void setParentsRepository(ParentsRepo parentsRepository) {
		this.parentsRepository = parentsRepository;
	}
    
}
