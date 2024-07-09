package apps;

import utilities.Console;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer myTokenizer = new StringTokenizer(Console.readString("Bitte einen Text eingeben"));
		Console.println("Der Text hat " + myTokenizer.countTokens() + " Wörter");
		Console.println("... und die Wörter sind:");
		
		while (myTokenizer.hasMoreTokens()) {
			Console.println(" - " + myTokenizer.nextToken());
		}
	}
}
