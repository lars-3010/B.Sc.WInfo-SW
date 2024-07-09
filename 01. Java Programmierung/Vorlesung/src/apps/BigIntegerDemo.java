package apps;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		long minValueLong = Long.MIN_VALUE;
		long maxValueLong = Long.MAX_VALUE;
		
		System.out.println("Der Datentyp Long kann Werte zwischen " + minValueLong + " und " + maxValueLong + " darstellen.");
		
		long power = 1;
		for (long i=1; i<=70; i++) {
			power += power;
			System.out.println("i = " + i + ", power = " + power);
		}
		
		//Berechnungen mit Big Integer
		BigInteger powerBigInteger = BigInteger.ONE;
		
		for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(70)) <= 0; i = i.add(BigInteger.ONE)) {
			powerBigInteger = powerBigInteger.add(powerBigInteger);
			System.out.println("i = " + i + ", powerBigInteger = " + powerBigInteger);
		}

	}

}