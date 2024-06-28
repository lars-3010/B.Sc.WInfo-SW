package apps;

import model.Location;
import model.Student;
import model.StudentCollection;

public class StudentCollectionApp {
    
    StudentCollection collection = new StudentCollection();
    
    collection.add(
        new Student("Bruno Harms",
            new Location ("Geburtsstr. 1", 38875, "Sorge"),
            new Location ("Schlaue Str. 42", 38875, "Elend")
        )
    );
    Student student = new Student(
        "Julia Bach",
        new Location ("Geburtsstr. 2", 38875, "Sorge"),
        new Location ("Schlaue Str. 314", 38875, "Elend")
        );

    collection.add(student);
    System.out.println(collection + "\n\n");
    
    collection.remove(student);
    System.out.println(collection + "\n\n");
}