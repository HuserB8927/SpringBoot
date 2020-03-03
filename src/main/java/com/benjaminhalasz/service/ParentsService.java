package com.benjaminhalasz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjaminhalasz.domain.Parents;
import com.benjaminhalasz.repository.ParentsRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ParentsService {
	@Autowired
	private ParentsRepo parentsRepository;
	
	public Parents findParents(String parentsName) {
		return parentsRepository.findParentByFirstName(parentsName);
	}

}
