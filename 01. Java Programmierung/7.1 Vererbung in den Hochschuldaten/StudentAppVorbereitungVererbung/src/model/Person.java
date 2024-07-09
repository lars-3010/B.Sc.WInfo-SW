package model;

public class Person {
    //Instanzvariablen von Person
    private String name;
    private Location placeOfBirth;
    private Location residence;

    public Person () {
		name = "Unknown";
	}

    //Konstruktoren von Person
    public Person(String name, Location placeOfBirth, Location residence) {
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.residence = residence;
    }

    //getter
    public getName() {
        return this.name;
    }
    public getPlaceOfBirth() {
        return this.placeOfBirth;
    }
    public getResidence() {
        return this.residence;
    }

    //setter
    public setName(String name) {
        this.name = name;
    }
    public setPlaceOfBirth(Location placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public setResidence(Location residence) {
        this.residence = residence;
    }

    //toString
    public String toString() {
        return "Name: " + this.name + "\n Place of Birth: " + this.placeOfBirth + "\n Residence: " + this.residence;
    }
}
