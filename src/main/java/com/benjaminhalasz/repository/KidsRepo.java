package com.benjaminhalasz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benjaminhalasz.domain.Kids;
import com.benjaminhalasz.domain.Parents;

@Repository
public interface KidsRepo extends CrudRepository<Kids, Long> {
	   List<Kids> findKidsByParentId(Parents Id);
	}