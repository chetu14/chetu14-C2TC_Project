package placement;

import placement.entities.Certificate;
import placement.service.CertificateService;
import placement.service.CertificateServiceImpl;

public class client {
	public static void main(String[] args) {
		Certificate u = new Certificate();
		Certificate u1 = new Certificate();
		CertificateService us= new CertificateServiceImpl();
		
		u.setId(300);
		u.setYear(2020);
		u.setCollege("IIT");
		
		u1.setId(301);
		u1.setYear(2020);
		u1.setCollege("IIT");
		
		us.addCertificate(u1);
		us.addCertificate(u);
		
		System.out.println("successfully added Certificate");
		
	}

}
