package model;

import model.*;

public class Lecturer extends Person {
	// Instanzvariablen, die nicht schon in Person definiert sind
	private Faculty faculty;
	private Role role;
	
	public Lecturer(String name, Location placeOfBirth, Location residence, Faculty faculty, Role role) {
		super(name, placeOfBirth, residence);
		this.faculty = faculty;
		this.role = role;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
 
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
 
	public Role getRole() {
		return role;
	}
 
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String toString() {
		return super.toString()
				+ ", belongs to " + this.faculty
				+ ", acts as " + this.role;
	}
}