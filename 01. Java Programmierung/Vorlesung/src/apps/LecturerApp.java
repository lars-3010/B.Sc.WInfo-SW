package apps;

import java.io.Console;
import model.*;

public class LecturerApp {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Dr. John Doe", new Location("New York", "USA"), new Location("Berlin", "Germany"), Faculty.BUSINESS_ADMINISTRATION, Role.LECTURER);

        System.out.println(lecturer1);

        //Einlesen der Daten über die Konsole
        Lecturer lecturer2 = new Lecturer();
        System.out.println(lecturer2);
    }

    private static Lecturer readLecturer() {
        return new Lecturer(
            Console.readString("Enter Lecturer Name")
            LocationController.readLocation("place of birth"),
            LocationController.readLocation("residence"),
            Console.readChoice("faculty", Faculty.values()),
            Console.readChoice("role", Role.values())
        );
    }
}
