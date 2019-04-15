package com.project.bank;

 class BranchNotFoundException extends RuntimeException {

	    BranchNotFoundException(Long id) {
	        super("Could not find branch " + id);
	}
}
