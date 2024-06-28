package apps;
import utilities.Console;

public class IntegerDemo {
public static void main(String[] args) {
int i = 123;
Integer j = Integer.valueOf(123);
String integerAsString = Console.readString("Bitte eine ganze Zahl eingeben");
Integer integerValue = Integer.valueOf(integerAsString);
int intValueResult = integerValue.intValue();
Console.println("Der Zahlenwert ist: " + intValueResult);
}
}