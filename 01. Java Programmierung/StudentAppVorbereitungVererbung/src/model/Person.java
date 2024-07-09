package model;

// Instanzvariablen
public class Person {
    private String name;
    private Location placeOfBirth;
    private Location residence;

    public Person(String name, Location placeOfBirth) {
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.residence = placeOfBirth;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
		this.name = firstName + " " + lastName;
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

     public String toString() {
        return this.name + "," + this.placeOfBirth + "," + this.residence;
    }
}
