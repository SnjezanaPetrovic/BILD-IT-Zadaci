package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// Napisati metode sa sljedećim headerima: public static int reverse(int
	// number) i public static boolean isPalindrome(int number). Prva metoda
	// prima cijeli broj kao argument i vraća isti ispisan naopako. (npr.
	// reverse(456) vraća 654.) Druga metoda vraća true ukoliko je broj
	// palindrom a false ukoliko nije. Koristite reverse metodu da
	// implementirate isPalindrome metodu. Napišite program koji pita korisnika
	// da unese broj te mu vrati da li je broj palindrome ili ne.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Unesite cijeli broj: ");
			int number = input.nextInt();
			if (isPalindrome(number)) {
				System.out.println("Broj je palindrom.");
			} else {
				System.out.println("Broj nije palindrom.");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	public static int reverse(int number) {

		int reverse = 0;
		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number) {

		if (number == reverse(number)) {
			return true;
		} else {
			return false;
		}

	}

}
