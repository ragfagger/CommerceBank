package com.example.bank.demo;

public class BranchNotFoundAdvice {
	   
	    String BranchNotFoundHandler(BranchNotFoundException ex) {
	        return ex.getMessage();
	}
}
