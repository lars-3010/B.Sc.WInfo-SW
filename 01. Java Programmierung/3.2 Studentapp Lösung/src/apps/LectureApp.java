package apps;

import java.io.Console;

import javax.tools.DocumentationTool.Location;

import model.*;

public class LectureApp {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Dr. Müller", "Bielefeld", Faculty.BUSINESS_ADMINISTRATION, Role.LECTURER);
        //new Location ("Meisenstr. 92", 33333, "Bielefeld");
        //new Location ("Finkenstr. 9", 44444, "Gütersloh");
        
        System.out.println(lecturer1);
    }

    /*private static Lecturer readLecturer() {
        return new Lecturer(
            utilities.Console.readString("Enter lecturer name: "),
            LocationController.readLocation("Enter place of birth: "),
            LocationController.readLocation("Enter residence: "),

        );
    }*/
}
