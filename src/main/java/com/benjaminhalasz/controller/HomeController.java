package com.benjaminhalasz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.benjaminhalasz.repository.KidsRepo;



@Controller
public class HomeController {
    KidsRepo kidsRepository;

    @Autowired
    public void setKidsRepository(KidsRepo kidsRepository) {
        this.kidsRepository = kidsRepository;
    }
}
