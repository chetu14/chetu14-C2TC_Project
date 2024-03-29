package place.service;


import place.entity.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);

	public Student searchStudentByHallTicket(long id);
	public boolean deleteStudent(long id);

}
