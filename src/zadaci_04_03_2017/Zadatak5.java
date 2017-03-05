package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak5 {
	// (Divisible by 5 or 6) Find the first ten numbers greater than
	// Long.MAX_VALUE
	// that are divisible by 5 or 6.

	public static void main(String[] args) {
		
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");

		number = number.add(BigInteger.ONE);

		
		int count = 1;
		while (count <= 10) {
			if (number.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
					|| number.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
				System.out.println(number);
				count++;

			}
			number = number.add(BigInteger.ONE);

		}

		

	}

}
