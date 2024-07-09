package model;

public class Lecturer {
    private String name;
    private Location placeOfBirth;
    private Location residence;
    private Faculty faculty;
    private Role role;

    // leerer Konstruktor
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
        return this.name;
    }

    public Location getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public Location getResidence() {
        return this.residence;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String toString() {
        return this.role + " " + this.name + ", lives at " + this.residence + ", born in " + this.placeOfBirth + ", faculty: " + this.faculty;
    }
}
