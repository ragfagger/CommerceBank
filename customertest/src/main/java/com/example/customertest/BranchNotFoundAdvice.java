package com.example.customertest;

public class BranchNotFoundAdvice {
	   
	    String BranchNotFoundHandler(BranchNotFoundException ex) {
	        return ex.getMessage();
	}
}
