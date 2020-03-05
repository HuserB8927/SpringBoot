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
    
//    public List<Kids> getKidsByParentsFirstName(String firstName) {
//        return kidsRepository.findAllByParents_FirstNameIgnoreCase(firstName);
//    }
    
	public List<Kids> getKidsByParentsLastName(String lastName) {
		return kidsRepository.findAllByParents_LastNameIgnoreCase(lastName);
	}
   
}
