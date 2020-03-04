package com.benjaminhalasz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjaminhalasz.domain.Parents;
import com.benjaminhalasz.repository.KidsRepo;
import com.benjaminhalasz.repository.ParentsRepo;

@Service
public class ParentsService {
	

	private ParentsRepo parentsRepository;
	
	@Autowired
    public void setParentsRepository(ParentsRepo parentsRepository) {
        this.parentsRepository = parentsRepository;
    }
	
	public Parents findParents(String parentsName) {
		return parentsRepository.findParentsByFirstName(parentsName);
	}
	public Parents findByLastName(String lastName) {
		return parentsRepository.findByLastName(lastName);
	}

}
