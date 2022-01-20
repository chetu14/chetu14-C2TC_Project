package placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {
	@Id
	private long id;
	private int year;
	private String college;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
	this.college = college;
	}
}
