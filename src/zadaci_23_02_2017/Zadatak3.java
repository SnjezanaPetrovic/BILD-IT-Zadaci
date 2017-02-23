package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// Napisati program koji pita korisnika da unese Social Security Number
	// (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
	// provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
	// program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u pravom
	// formatu, program završava sa radom.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			boolean valid = false;
			// Uzimamo string od korisnika
			System.out.println("Unesite Social Security Number u formatu DDD-DD-DDDD gdje D predstavlja broj: ");
			String ssn = input.nextLine();
			while (!valid) {

				if (isValidNum(ssn)) {
					System.out.println("Social Security Number je validan.");
					valid = true;
				} else {
					System.out.println("Social Security Number nije validan.Pokušajte ponovo: ");
				}
				valid = false;
				ssn = input.nextLine();
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	// Metoda koja provjerava da li je broj validan
	public static boolean isValidNum(String ssn) {

		if (ssn.length() != 11) {
			return false;
		} else {
			for (int i = 0; i < ssn.length(); i++) {
				if (i == 3 || i == 6) {
					if (ssn.charAt(i) != '-') {
						return false;

					}
				} else {
					if (!Character.isDigit(ssn.charAt(i))) {
						return false;
					}
				}
			}
		}

		return true;
	}

}
