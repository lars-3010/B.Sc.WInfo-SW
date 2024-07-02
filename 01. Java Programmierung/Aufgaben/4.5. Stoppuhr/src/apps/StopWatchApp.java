// author: Katrin Witting (based on exercise by Peter Ruckmann)
//Lösung von Hausübung 3.5

package apps;

import java.time.*;
import utilities.Console;

public class StopWatchApp {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime vorReturn = LocalDateTime.now();
		Console.readString("Please press Return-Key");
		LocalDateTime nachReturn = LocalDateTime.now();
		System.out.println("Zeit vor Return:  "+ vorReturn + "\nZeit nach Return: " + nachReturn);
		
		Duration difference = Duration.between(vorReturn, nachReturn);
		long diffInSeconds = difference.getSeconds();
		
		long myMinutes = diffInSeconds/60;
		long mySeconds = diffInSeconds%60;
		System.out.println("Die Return-Taste wurde nach " + myMinutes + " Minuten und " + mySeconds + " Sekunden gedrückt.");

	}
}
