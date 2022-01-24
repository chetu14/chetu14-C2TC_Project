package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Certificate;
import com.example.demo.repo.CertificateRepo;

@Service
public class CertificateImpl implements CertificateService {
	@Autowired
	CertificateRepo cr;
	
	@Override
	public void addCertificate(Certificate c) {
		cr.save(c);
		
	}

	@Override
	public Certificate getCertificate(int uid) {
		return cr.findById(uid).get();
	}

	

	@Override
	public Certificate updateCertificate(Certificate c) {
		cr.save(c);
		return c;
	}

	@Override
	public String deleteCertificate(int uid) {
		Certificate c = cr.findById(uid).get();
		cr.delete(c);
		return uid+ "is deleted successfully";
	}
}