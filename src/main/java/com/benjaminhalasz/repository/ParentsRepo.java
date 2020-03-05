package com.benjaminhalasz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benjaminhalasz.domain.Parents;

@Repository
public interface ParentsRepo extends CrudRepository<Parents, String> {

	List<Parents> findAll();
	
	Parents findParentsByFirstName(String parentsName);

	Parents findParentsByLastName(String lastName);

}
