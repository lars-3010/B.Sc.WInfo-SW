package apps;

import utilities.*;
import model.*;

public class ConsoleApp {

	public static void main(String[] args) {
		Student student1 = new Student(Console.readString("Student name"),
									new Location(Console.readString("Street + no."),
											     Console.readInt("Postal code"),
											     Console.readString("Town")),
									new Location(Console.readString("Street + no."),
										     Console.readInt("Postal code"),
										     Console.readString("Town"))
						   );
		System.out.println(student1);

	}

}
