package apps;
import model.*;
import utilities.Console;

public class SubjectApp{
    
    public static void main(String[] args) {

	    Subject subject = Subject.BUSINESS_ADMINISTRATION;
	    System.out.println(subject + "(" + subject.ordinal() + ")\n");
	    
	    System.out.println("Ausgabe aller Subjects mit erweiterte for-Schleife");
	    Subject[] subjects = Subject.values();
	    for (Subject subject1 : subjects) {
	      System.out.println("- " + subject1);
	    }
	    	    
	    System.out.println("\nEinlesen/Ausgeben von Subjects mit Hilfe der Klasse Console:");
	    subject = Console.readChoice("subject", Subject.values());
	    Console.println("Subject just read is " + subject);
	    
	    System.out.println("\nNutzung der Methode parseSubject");
	    Subject subject2 = Subject.parseSubject("Wirtschaftsinformatik");
	    System.out.println(subject2);    

	}
}
