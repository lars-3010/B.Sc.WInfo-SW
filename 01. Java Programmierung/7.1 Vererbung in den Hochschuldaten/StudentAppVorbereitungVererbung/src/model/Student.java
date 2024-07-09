package model;

import model.*;

//Implementation of StudentApp, Übung 1.11
//Katrin Witting (basierend auf einem Konzept von Peter Ruckmann)


public class Student extends Person{
	
	//Instanzvariablen von Student
	private int id;

	private Subject subject;
	
	//Konstruktoren von Student
	
	// Remove the duplicate constructor
	
	public Student(String firstName, String lastName, Location placeOfBirth) {
		super(firstName + " " + lastName, placeOfBirth, placeOfBirth);
		this.id = model.IdFactory.getNextId();
	}
	
	public Student(String name, Location placeOfBirth, Location residence) {
		super(name, placeOfBirth, residence);
		this.id = model.IdFactory.getNextId();
    }
	
	public Student(String firstName, String lastName, Location placeOfBirth, Location residence) {
		super(firstName + " " + lastName, placeOfBirth, residence);
		this.id = model.IdFactory.getNextId();
    }
	
	//Konstruktoren, erweitert um Subject
	
	public Student(String name, Location placeOfBirth, Subject subject) {
		super(name, placeOfBirth, placeOfBirth);
		this.id = model.IdFactory.getNextId();
		this.subject = subject;
	}
	
	public Student(String firstName, String lastName, Location placeOfBirth, Subject subject) {
		super(firstName + " " + lastName, placeOfBirth, placeOfBirth);
		this.id = model.IdFactory.getNextId();
		this.subject = subject;
	}
	
	public Student(String name, Location placeOfBirth, Location residence, Subject subject) {
		super(name, placeOfBirth, residence);
		this.id = model.IdFactory.getNextId();
		this.subject = subject;
    }
	
	public Student(String firstName, String lastName, Location placeOfBirth, Location residence, Subject subject) {
		super(firstName + " " + lastName, placeOfBirth, residence);
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
		if (this.subject != null) {
			return super.toString()	+ "\n with the id (" + this.id + ")" +  "\n  and studies " + this.subject;
		}
		else {
			return super.toString()	+ "\n with the id (" + this.id + ")" +  "\n  and studies nothing";
		}
	}

	
}



