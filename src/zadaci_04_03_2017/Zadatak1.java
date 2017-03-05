package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak1 {
	// (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits
	// that are
	// divisible by 2 or 3.

	public static void main(String[] args) {

		BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");

		int count = 1;
		while (count <= 10) {
			if (number.remainder(new BigInteger("2")).equals(BigInteger.ZERO)
					|| number.divide(new BigInteger("3")).equals(BigInteger.ZERO)) {
				System.out.println(number);
				count++;

			}
			number = number.add(BigInteger.ONE);

		}

	}

}
