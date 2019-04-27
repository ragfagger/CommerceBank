package com.example.fulltest;

public class BranchNotFoundAdvice {
	   
	    String BranchNotFoundHandler(BranchNotFoundException ex) {
	        return ex.getMessage();
	}
}
