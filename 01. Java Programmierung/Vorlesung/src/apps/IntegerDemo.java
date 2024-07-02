package apps;
import utilities.Console; 

public class IntegerDemo {

	public static void main(String[] args) {
		int i = 1;
		
		// Integer j = new Integer(2); // wird in Zukunft leider nicht mehr unterstützt (deprecated)
		
		Integer j = Integer.valueOf(2);
		
		String integerAsString = Console.readString("Bitte ganze Zahl eingeben");
		
		Integer integerValue = Integer.valueOf(integerAsString);
		int intValue = integerValue.intValue();
		
		Console.println("Der Zahlwert ist: " + intValue);
		
		// hier gleiche Ausgabe einfach über:
		System.out.println("Der Zahlwert ist: " + intValue);
		

	}

}
