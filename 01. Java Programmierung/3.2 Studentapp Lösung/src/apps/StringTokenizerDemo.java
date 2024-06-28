package apps;
import java.util.StringTokenizer;
import utilities.Console;


public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer myTokenizer = new StringTokenizer(Console.readString(
        "Bitte einen Text eingeben"));
        Console.println("Der Text hat " + myTokenizer.countTokens() + " Wörter");
        Console.println("... und die Wörter sind:");
        
        while (myTokenizer.hasMoreTokens()) {
            Console.println(" - " + myTokenizer.nextToken());
        }
    }
}