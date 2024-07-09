package model;

//Implementation of StudentApp, Übung 1.11
//Katrin Witting (basierend auf einem Konzept von Peter Ruckmann)

//Top-level-Klasse Student
public class Student {
	
	//Instanzvariablen von Student
	private int id;
	private String name;
	private Location placeOfBirth;
	private Location residence;
	private Subject subject;
	
	//Konstruktoren von Student
	
	public Student(String name, Location placeOfBirth) {
		this.id = model.IdFactory.getNextId();
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.residence = placeOfBirth;
	}
	
	public Student(String firstName, String lastName, Location placeOfBirth) {
		this.id = model.IdFactory.getNextId();
		this.name = firstName + " " + lastName;
		this.placeOfBirth = placeOfBirth;
		this.residence = placeOfBirth;
	}
	
	public Student(String name, Location placeOfBirth, Location residence) {
		this.id = model.IdFactory.getNextId();
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.residence = residence;
    }
	
	public Student(String firstName, String lastName, Location placeOfBirth, Location residence) {
		this.id = model.IdFactory.getNextId();
		this.name = firstName + " " + lastName;
		this.placeOfBirth = placeOfBirth;
		this.residence = residence;
    }
	
	//Konstruktoren, erweitert um Subject
	
	public Student(String name, Location placeOfBirth, Subject subject) {
		this.id = model.IdFactory.getNextId();
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.residence = placeOfBirth;
		this.subject = subject;
	}
	
	public Student(String firstName, String lastName, Location placeOfBirth, Subject subject) {
		this.id = model.IdFactory.getNextId();
		this.name = firstName + " " + lastName;
		this.placeOfBirth = placeOfBirth;
		this.residence = placeOfBirth;
		this.subject = subject;
	}
	
	public Student(String name, Location placeOfBirth, Location residence, Subject subject) {
		this.id = model.IdFactory.getNextId();
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.residence = residence;
		this.subject = subject;
    }
	
	public Student(String firstName, String lastName, Location placeOfBirth, Location residence, Subject subject) {
		this.id = model.IdFactory.getNextId();
		this.name = firstName + " " + lastName;
		this.placeOfBirth = placeOfBirth;
		this.residence = residence;
		this.subject = subject;
    }
	
	
	// Instanzmethoden von Student:
	
	public int getId() {
		return this.id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
		
	public String getName() {
		return this.name;
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


