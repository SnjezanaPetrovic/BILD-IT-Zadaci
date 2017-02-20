package mini2_CrapsAndCreditCards;

import java.util.Scanner;

public class Financial_CreditCard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter a credit card number: ");
			long number = input.nextLong();
			if (isValid(number)) {
				System.out.println("Credit card number is valid.");
			} else {
				System.out.println("Credit card number is invalid.");
			}
		} catch (Exception ex) {
			System.out.println("Invalid input.");
		}
		input.close();

	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {

		int[] prefix = { 37, 5, 4, 6 };

		// checking if there is max 16 and min 13 digits

		if (getSize(number) > 16 || getSize(number) < 13)
			return false;
		boolean on = false;

		// checking prefixes
		for (int i = 0; i < prefix.length; i++) {

			if (getPrefix(number, prefix[i]) == prefix[i]) {
				on = true;
				break;
			}
		}
		if (on) {

			int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
			if (sum % 10 != 0) {
				return false;
			}
			return true;
		}
		return false;
	}

	// Return sum of even-place doubled digits in number
	public static int sumOfDoubleEvenPlace(long number) {

		int sum = 0;
		while (number != 0) {
			number/=10;
			int digit = getDigit((int) (number % 10) * 2);
			sum += digit;
			number /= 10;
		}
		return sum;

	}

	// Return this number if it is a single digit, otherwise, return the sum of
	// the two digits

	public static int getDigit(int number) {

		if (Integer.toString(number).length() == 1) {
			return number;
		} else {
			return (number % 10) + 1;
		}

	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {

		int sum = 0;
		while (number != 0) {

			int digit = (int) (number % 10);
			sum += digit;
			number /= 100;

		}
		return sum;

	}

	// Return true if the digit d is a prefix for number
	public static boolean prefixMatched(long number, int d) {

		String s1 = Long.toString(number);
		String s2 = Integer.toString(d);

		if (d == 37) {
			if (s1.charAt(0) == s2.charAt(0) && s1.charAt(1) == s2.charAt(1)) {
				return true;
			} else {
				return false;
			}
		} else {
			if (s1.charAt(0) == s2.charAt(0)) {
				return true;
			}
			return false;
		}

	}

	// Return the number of digits in d
	public static int getSize(long d) {

		return Long.toString(d).length();

	}

	// Return the first k number of digits from number. If the number of digits
	// in number is less than k, return number.

	public static long getPrefix(long number, int k) {

		if (prefixMatched(number, k))
			return k;

		return number;
	}

}
