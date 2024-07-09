package model;
public enum Role {
	LECTURER ("Lecturer", "Dozent"),
	VISITING_LECTURER("Visiting Lecturer", "Honorardozent"),
	FACULTY_DIRECTOR("Faculty Director", "Dekan"),
	PRESIDENT("President", "Präsident");

	String englishName;
	String germanName;
	private Role(String englishName, String germanName) {
		this.englishName = englishName;
		this.germanName = germanName;
	}
	
	public String toString() {
		return this.germanName;
	}
}
