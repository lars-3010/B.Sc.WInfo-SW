package apps;

import model.Location;
import model.Student;
import model.Subject;
import model.IdFactory;

public class StudentApp {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println(student1); 
		System.out.println(student1.getName()); //aktueller Name
		System.out.println(student1.getId()); //aktuelle Id
		
		student1.setName("Peter Pan");
		
		System.out.println(student1); 
		
	    System.out.println("Number of available Id's: "+  IdFactory.getNoOfAvailableIds());
	    System.out.println("Number of assigned Id‘s: "+ IdFactory.getNoOfAssignedIds());
	
	    Student student3 = new Student("Anne Müller", 
	    								new Location("Meisenstr. 92", 33333, "Bielefeld"), 
	    								new Location("Finkenstr. 9", 44444, "Gütersloh")
	    				   );
	    System.out.println(student3);
	    
	    Student student4 = new Student("Anne Müller", 
				new Location("Meisenstr. 92", 33333, "Bielefeld"), 
				new Location("Finkenstr. 9", 44444, "Gütersloh"), 
				Subject.BUSINESS_INFORMATICS
	    );
	    System.out.println(student4);
	    System.out.println(student4.getSubject());
	}

}
