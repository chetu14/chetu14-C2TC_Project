package place;

import place.entity.Student;
import place.service.StudentService;
import place.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) {
		Student s = new Student();
		StudentService ss= new StudentServiceImpl();
		
		s.setId(90001);
		s.setName("Rock");
		s.setRoll(10009);
		s.setQualification("BE");
		s.setCourse("CSE");
		s.setYear(2021);
		s.setHallTicketNo(123);
		s.setCertificate("JEE");
		s.setCollege("IIT");
		ss.addStudent(s);
		System.out.println("successfully added");
		
		
		System.out.println(ss.searchStudentById(90002));
		
	}

}
