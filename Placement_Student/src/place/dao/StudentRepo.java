package place.dao;

import place.entity.Student;

public interface StudentRepo {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);
	public Student searchStudentByHallTicket(long ticketNo);
	public boolean deleteStudent(long id);
	public void startTransaction();
	public void endTransaction();
	

}
