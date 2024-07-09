package model;
public class Student extends Person{
	
	//Instanzvariablen von Student
	private int id;
	private String name;
	private Location placeOfBirth;
	private Location residence;
	private Subject subject;
	
	//Konstruktoren von Student
	
	public Student(String name, Location placeOfBirth) {
        super(name, placeOfBirth); // Aufruf des Konstruktors der Superklasse
        this.id = model.IdFactory.getNextId();
    }

    public Student(String firstName, String lastName, Location placeOfBirth) {
        super(firstName + " " + lastName, placeOfBirth); // Aufruf des Konstruktors der Superklasse
        this.id = model.IdFactory.getNextId();
    }
	
	// Instanzmethoden von Student:
	
	public int getId() {
		return this.id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public Subject getSubject() {
	    return subject;
	}
	
	public void setSubject(Subject subject) {
        this.subject = subject;
    }

	
	// Override toString(), with subject
	public String toString() {
		if (this.subject != null) {
			return this.name + " (" + this.id + "), \n  born at " + this.placeOfBirth + 
					", \n  lives at " + this.residence + "\n  and studies " + this.subject;
		}
		else {
			return this.name + " (" + this.id + "), \n  born at " + this.placeOfBirth + 
					",\n  lives at " + this.residence;
		}
	}

	
}


