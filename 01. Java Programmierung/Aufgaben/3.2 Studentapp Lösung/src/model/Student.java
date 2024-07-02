package model;

import utilities.IdFactory;

/**
 * This is the class "Student"
 * @author Katrin W.
 *
 **/

public class Student {
	
	//Instanzvariablen
	private int id;
	private String name;
	private Location placeOfBirth;
	private Location residence;
	
	//Konstruktoren
	public Student(){
		//empty constructor
		this.id = IdFactory.getNextId();
	}
	
	public Student(String name){
		this.id = IdFactory.getNextId();
		this.name = name;
	}
	
	public Student(String name, Location placeOfBirth, Location residence){
		this.id = IdFactory.getNextId();
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.residence = residence;
	}
	
	// Getter and setter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String firstName, String lastName) {
		this.name = firstName + " " + lastName;
	}
	
	@Override
	public String toString() {
		//return "Student [id=" + id + ", name=" + name + "]";
		return "Student " + name + " hat die Id " + id + ",\n wurde geboren in " + placeOfBirth + "\n und wohnt jetzt in " + residence;
	}
}
