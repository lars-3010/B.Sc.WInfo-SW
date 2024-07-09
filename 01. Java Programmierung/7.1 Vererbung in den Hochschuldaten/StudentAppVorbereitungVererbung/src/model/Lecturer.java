package model;

public class Lecturer{
	private String name;
	private Location placeOfBirth;
	private Location residence;
	private Faculty faculty;
	private Role role;
	
	public Lecturer() {
		this.name = "Unknown";
	}
	
	public Lecturer(String name, Location placeOfBirth, Location residence, Faculty faculty, Role role) {
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.residence = residence;
		this.faculty = faculty;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	
	public Location getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(Location placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public Location getResidence() {
		return residence;
	}

	public void setResidence(Location residence) {
		this.residence = residence;
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
		return this.role + " " + this.name + ", \n  born at " + this.placeOfBirth + 
				", \n  lives at " + this.residence + "\n  and belongs to faculty " + this.faculty;
	}

}
