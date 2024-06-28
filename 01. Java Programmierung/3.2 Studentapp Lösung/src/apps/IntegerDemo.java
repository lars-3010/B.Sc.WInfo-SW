package apps;
import utilities.Console;

public class IntegerDemo {
    
    public static void main(String[] args) {
        int i = 1;

        //Integer j = new Integer(2); wird in Zukunft leider nicht mehr unterstützt

        Integer j = Integer.valueOf(2);
        
        String integerAString = Console.readString("Bitte ganze Zahl angeben");

        Integer integerValue = Integer.valueOf(integerAString);
        int intValue = integerValue.intValue();

        Console.println("Der Zahlwert ist: " + integerValue);

        //hier gleiche Ausgabe einfach über:
        System.out.println("Der Zahlwert ist: " + integerValue);
    }
}
