package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Certificate;

public interface CertificateRepo extends JpaRepository<Certificate, Integer> {
	

}
