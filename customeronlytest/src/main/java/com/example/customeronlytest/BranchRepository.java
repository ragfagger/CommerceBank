package com.example.customeronlytest;

import org.springframework.data.jpa.repository.JpaRepository;

interface BranchRepository extends JpaRepository<Branch, Long> {
	
}
