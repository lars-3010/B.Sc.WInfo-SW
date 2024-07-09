package model;

public enum Role {
    LECTURER ("Lecturer","Dozent",1),
    VISITING_LECTURER ("Visiting Lecturer","Gastdozent",2),
    FACULTY_DIRECTOR ("Faculty Director","Professor",3),
    PRESIDENT ("President","Präsident",4);

    private String germanName;
    private String englishName;
    private int roleNumber;

    private Role(String englishName, String germanName, int roleNumber) {
        this.germanName = germanName;
        this.roleNumber = roleNumber;
    }

    public String toString() {
        return this.germanName;
    }
}
