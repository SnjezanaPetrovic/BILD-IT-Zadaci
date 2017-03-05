package zadaci_04_03_2017;

import java.math.BigDecimal;


public class Zadatak2 {
	// (Square numbers) Find the first ten square numbers that are greater than
	// Long.MAX_VALUE. A square number is a number in the form of n2. For
	// example,
	// 4, 9, and 16 are square numbers. Find an efficient approach to run your
	// program fast.

	public static void main(String[] args) {

		BigDecimal number = new BigDecimal(Math.round(Math.sqrt(Long.MAX_VALUE)));

		for (int i = 1; i <= 10; i++) {
			System.out.println(number.multiply(number));
			number = number.add(BigDecimal.ONE);
		}

	}

}
