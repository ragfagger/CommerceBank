package com.example.bank.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface BranchRepository extends JpaRepository<Branch, Long> {
	
}
