package com.project.bank;

public class BranchNotFoundAdvice {
	   
	    String BranchNotFoundHandler(BranchNotFoundException ex) {
	        return ex.getMessage();
	}
}
