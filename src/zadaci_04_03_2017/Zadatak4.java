package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak4 {
	// (Mersenne prime) A prime number is called a Mersenne prime if it can be
	// written
	// in the form 2p - 1 for some positive integer p. Write a program that
	// finds
	// all Mersenne primes with p … 100 and displays the output as shown below.
	// (Hint: You have to use BigInteger to store the number, because it is too
	// big to
	// be stored in long. Your program may take several hours to run.)
	// p 2^p – 1
	// 2 3
	// 3 7
	// 5 31
	// ...

	public static void main(String[] args) {

		System.out.println(" p     2^p-1");
		System.out.println("-------------------------------------------------------");
		int numberOfPrimes = 0;
		for (int i = 2; numberOfPrimes < 100; i++) {
			if (isPrime(i)) {
				numberOfPrimes++;
				System.out.printf("%-10d%-10s\n", i, getMersennePrime(i));
			}
		}

	}

	public static boolean isPrime(long number) {

		long square = (long) Math.sqrt(number);
		for (int i = 2; i <= square; i++) {

			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static BigDecimal getMersennePrime(int num) {

		return new BigDecimal(2).pow(num).subtract(BigDecimal.ONE);
	}
}
