package com.example.bank.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BranchInfo {

		private @Id @GeneratedValue Long BranchId;
	    private String Street; //subject to change
	    private String City; //subject to change
		private String State;
		private int Zip;


	    BranchInfo() {}

	    BranchInfo(String Street, String City, String State, int Zip) {
        this.Street = Street;
	    this.City = City;
	    this.State = State;
		this.Zip = Zip;
    }
	}

