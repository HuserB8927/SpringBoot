package com.benjaminhalasz.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Kids {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Parents parents;

    public Kids() {
    }

    public Kids(String firstName, String lastName, Parents parents) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.parents = parents;
    }
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Parents getParents() {
		return parents;
	}

	public void setParents(Parents parents) {
		this.parents = parents;
	}
}
