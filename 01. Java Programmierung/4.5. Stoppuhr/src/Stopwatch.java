import java.io.Console;
import java.time.Duration;
import java.time.LocalDateTime;

public class Stopwatch {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("No console available");
            System.exit(1);
        }

        // Capture start time
        LocalDateTime startTime = LocalDateTime.now();
        
        // Prompt user to press Return key
        console.readLine("Please press Return-Key");
        
        // Capture end time
        LocalDateTime endTime = LocalDateTime.now();
        
        // Calculate duration
        Duration duration = Duration.between(startTime, endTime);
        
        // Convert to minutes and seconds
        long minutes = duration.toMinutes();
        long seconds = duration.minusMinutes(minutes).getSeconds();
        
        // Output result
        System.out.printf("Time elapsed: %d minutes and %d seconds%n", minutes, seconds);
    }
}