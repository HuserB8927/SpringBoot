package com.benjaminhalasz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity 
public class Parents {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @OneToMany(mappedBy="parents") 
    private List<Kids> kids;
	
	public Parents() {
		
	}

	public Parents(@NotNull String firstName, @NotNull String lastName, List<Kids> kids) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.kids = kids;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Kids> getKids() {
		return kids;
	}

	public void setKids(List<Kids> kids) {
		this.kids = kids;
	}

}
