package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak3 {
	// (Large prime numbers) Write a program that finds five prime numbers
	// larger
	// than Long.MAX_VALUE.

	public static void main(String[] args) {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");

		number = number.add(BigInteger.ONE);

		int count = 1;
		while (count <= 5) {

			if (isPrime(number)) {
				System.out.println(number);
				count++;
			}
			number = number.add(BigInteger.ONE);
		}

	}

	public static boolean isPrime(BigInteger number) {
		
		BigInteger halfInt =number.divide(new BigInteger("2"));
		
		for (BigInteger i = new BigInteger("2"); i.compareTo(halfInt) <= 0; i=i.add(BigInteger.ONE)) {
			if(number.remainder(i).equals(BigInteger.ZERO)) {
				return false;
			}
			
		}
		return true;
	}

}
