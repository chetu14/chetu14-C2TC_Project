package com.example.demo.service;

import com.example.demo.entities.Certificate;

public interface CertificateService {
	public void addCertificate(Certificate c);
	
	public Certificate getCertificate(int uid);
	
	public Certificate updateCertificate(Certificate c);
	
	public String deleteCertificate(int uid);
	
	
}
