package com.benjaminhalasz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benjaminhalasz.domain.Parents;

@Repository
public interface ParentsRepo extends CrudRepository<Parents, Long> {

	Parents findParentByFirstName(String firstName);

}
