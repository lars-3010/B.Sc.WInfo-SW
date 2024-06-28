package apps;

import java.math.BigDecimal;

public class BigDecimalDemo {
    
    public static void main(String[] args) {
        double zahl = 0.01;
        double sum = 0;

        for (int i = 1; i <= 1000; i++) {
            sum += zahl;
        }

        //Datentyp double
        System.out.println("Erwartete Summe: 1000 * 0.01 = " + (double) 1000 * 0.01);
        System.out.println("Berechnete Summe aus der for-Schleife: " + sum);

        //Datentyp BigDecimal
        BigDecimal zahlBigDecimal = new BigDecimal("0.01");
        BigDecimal sumBigDecimal = new BigDecimal("0");
        
    }
}