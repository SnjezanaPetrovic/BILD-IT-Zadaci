package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	// Napisati program koji pita korisnika da unese cijeli trocifreni broj te
	// provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko se
	// čita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// Uzimamo broj od korisnika
			System.out.println("Unesite cijeli trocifren broj: ");
			int number = input.nextInt();
			// provjeravamo da li je broj pozitivan  trocifren broj
			if (number > 99 && number < 1000) {
				if (isPalindrome(number)) {
					System.out.println("Broj je palindrom.");
				} else {
					System.out.println("Broj nije palindrom.");
				}
			} else {
				System.out.println("Broj mora biti pozitivan i trocifren.");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Unesite cijeli trocifren broj.");
			input.nextLine();
		}
		input.close();

	}

	// metoda koja vraća broj okrenut naopako
	public static int reverseNum(int num) {

		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		return reverse;

	}

	// metoda koja vraća true ako je broj palindrom
	public static boolean isPalindrome(int num) {
		return num == reverseNum(num);
	}

}
