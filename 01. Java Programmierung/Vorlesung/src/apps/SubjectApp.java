package apps;
import model.Subject;
import utilities.Console;

public class SubjectApp{
    public static void main(String[] args) {
        Subject subject = Subject.BUSINESS_ADMINISTRATION;
        System.out.println(subject + "(" + subject.ordinal() + ")");
        Subject[] subjects = Subject.values();
        
        for (Subject subject1 : subjects) {
            System.out.println("- " + subject1);
        }
        subject = Console.readChoice("subject", Subject.values());
        Console.println("Subject just read is " + subject);
    }
}