package com.example.bank.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
}
