package com.example.fulltest;

import org.springframework.data.jpa.repository.JpaRepository;

interface BranchRepository extends JpaRepository<Branch, Long> {
	
}
