package com.benjaminhalasz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benjaminhalasz.domain.Kids;

@Repository
public interface KidsRepo extends CrudRepository<Kids, String> {
	List<Kids> findAll();
	
//	List<Kids> findAllByParents_FirstNameIgnoreCase(String parentsFirstName);

	
	//We want to get Kids objects so we write the method in the KidsRepo
	List<Kids> findAllByParents_LastNameIgnoreCase(String parentsLastName);
	
	
	}