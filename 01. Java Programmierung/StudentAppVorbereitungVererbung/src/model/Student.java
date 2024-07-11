package model;

public class Student extends Person{
	
	//Instanzvariablen von Student
	private int id;
	private Subject subject;
	
	//Konstruktoren von Student
	
	public Student(String name, Location placeOfBirth, Location residence, Subject subject) {
        super(name, placeOfBirth); // Aufruf des Konstruktors der Superklasse
        this.id = model.IdFactory.getNextId();
		this.subject = subject;
    }

    public Student(String firstName, String lastName, Location placeOfBirth, Location residence, Subject subject) {
        super(firstName + " " + lastName, placeOfBirth); // Aufruf des Konstruktors der Superklasse mit LastName
        this.id = model.IdFactory.getNextId();
		this.subject = subject;
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
		return super.toString()
			+ ", has id " + this.id
			+ ", studies " + this.subject;
	}

	
}


