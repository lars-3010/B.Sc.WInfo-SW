package apps;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Stopwatch {
    private static LocalDateTime startZeit;
    private static LocalDateTime endZeit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Drücken Sie Enter, um die Stoppuhr zu starten.");
        scanner.nextLine();
        start();
        
        System.out.println("Drücken Sie Enter, um die Stoppuhr zu stoppen.");
        scanner.nextLine();
        stop();
        
        zeigeDauer();
        
        scanner.close();
    }

    public static void start() {
        startZeit = LocalDateTime.now();
        System.out.println("Stoppuhr gestartet um: " + startZeit);
    }

    public static void stop() {
        endZeit = LocalDateTime.now();
        System.out.println("Stoppuhr gestoppt um: " + endZeit);
    }

    public static void zeigeDauer() {
        Duration dauer = Duration.between(startZeit, endZeit);
        long sekunden = dauer.getSeconds();
        long nanos = dauer.getNano();
        
        System.out.printf("Gemessene Zeit: %d Sekunden und %d Nanosekunden%n", sekunden, nanos);
    }
}
