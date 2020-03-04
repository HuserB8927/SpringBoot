package com.benjaminhalasz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjaminhalasz.domain.Kids;
import com.benjaminhalasz.repository.KidsRepo;

@Service
public class KidsService {
	
    KidsRepo kidsRepository;


    @Autowired
    public void setKidsRepository(KidsRepo kidsRepository) {
        this.kidsRepository = kidsRepository;
    }
    
    public List<Kids> getKids(String parentsName) {
        return kidsRepository.findAllByParents_FirstName(parentsName);
    }
}
