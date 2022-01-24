package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Certificate;
import com.example.demo.service.CertificateService;

@RestController
public class Controller {
	
	@Autowired
	CertificateService cs;
	
	@PostMapping("/addCertificate")
	public void addCertificate(@RequestBody Certificate c) {
		cs.addCertificate(c);
	}

	@GetMapping("/getCertificate/{uid}")
	public Certificate getCertificate(@PathVariable int uid) {
		return cs.getCertificate(uid);
}
	
	
	@PutMapping("/updateCertificate")
	public Certificate updateCertificate(@RequestBody Certificate c) {
		return  cs.updateCertificate(c);
	}
	
	@DeleteMapping("/deleteCertificate/{uid}")
	public String deleteCertificate(@PathVariable int uid) {
		return  cs.deleteCertificate(uid);
	}
	
	
	
	
}
