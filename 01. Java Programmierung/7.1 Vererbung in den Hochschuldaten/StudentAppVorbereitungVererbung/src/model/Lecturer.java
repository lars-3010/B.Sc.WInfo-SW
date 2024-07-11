package model;

public final class Lecturer extends Person{
	private Faculty faculty;
	private Role role;
	
	public Lecturer(String name, Location placeOfBirth, Location residence, Faculty faculty, Role role) {
		super(name, placeOfBirth, residence); // Invoke the constructor of the superclass 'Person'
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

	public String getTypeName() {
		return "Lecturer";
	}
	
	public String toString() {
		return super.toString() + "\n  and belongs to faculty " + this.faculty + "\n and has the role " + this.role;
	}

}
