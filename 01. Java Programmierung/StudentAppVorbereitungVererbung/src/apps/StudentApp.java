package apps;

import model.*;

public class StudentApp {

	public static void main(String[] args) {
		// Examples for our methods of class Student
	    
		Student student1 = new Student("Anne","Müller",
				                     new Location("Bachstr. 3", 33178, "Borchen"),
				                     new Location("Imadstr. 25", 33102, "Paderborn"));
		System.out.println(student1);
		System.out.println(student1.getPlaceOfBirth() == student1.getResidence());
		
		Student student2 = new Student("Arno","Meyer",
                new Location("Bachstr. 5", 33178, "Borchen"),
                new Location("Hauptstr. 211", 33104, "Paderborn"));
		System.out.println(student2);
		System.out.println(student2.getPlaceOfBirth() == student2.getResidence());
		
		Location loc3 = new Location("Meisenstr. 92", 33607, "Bielefeld");
		Student student3 = new Student("Moritz Fleißig", loc3, loc3);
		System.out.println(student3);
		System.out.println(student3.getPlaceOfBirth() == student3.getResidence());
		
	    //Beispiele mit parseSubject
	    Subject subject2 = Subject.parseSubject("Wirtschaftsinformatik");
	    System.out.println(subject2);
	    Subject subject3 = Subject.parseSubject("General Management");
	    System.out.println(subject3);
	    
	    // Beispiele für Studenten mit Subject
	    student1.setSubject(subject2);
	    System.out.println(student1);
	    
	    //ist kein Subject angegeben, liefert toString die Ausgabe ohne subject
	    System.out.println(student2);
	   	
	}
}
