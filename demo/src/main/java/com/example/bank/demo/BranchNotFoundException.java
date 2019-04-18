package com.example.bank.demo;

 class BranchNotFoundException extends RuntimeException {

	    BranchNotFoundException(Long id) {
	        super("Could not find branch " + id);
	}
}
