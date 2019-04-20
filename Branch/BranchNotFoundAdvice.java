package com.example.customeronlytest;

public class BranchNotFoundAdvice {
	   
	    String BranchNotFoundHandler(BranchNotFoundException ex) {
	        return ex.getMessage();
	}
}
