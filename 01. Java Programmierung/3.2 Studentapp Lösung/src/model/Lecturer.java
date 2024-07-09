package model;

public class Lecturer {
    private String name;
    private String placeOfBirth;
    private Faculty faculty;
    private Role role;

    //Konstruktor
    public Lecturer(){
        this.name = "unknown";
    }

    public Lecturer(String name, String placeOfBirth, Faculty faculty, Role role){
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.faculty = faculty;
        this.role = role;
    }

    //Getter
    public String getName(){
        return this.name;
    }
    public String getPlaceOfBirth(){
        return this.placeOfBirth;
    }
    public Faculty getFaculty(){
        return this.faculty;
    }
    public Role getRole(){
        return this.role;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setPlaceOfBirth(String placeOfBirth){
        this.placeOfBirth = placeOfBirth;
    }
    public void setFaculty(Faculty faculty){
        this.faculty = faculty;
    }
    public void setRole(Role role){
        this.role = role;
    }
}
