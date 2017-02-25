package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napisati program koji prima karakter te vraća njegov Unicode. Primjer:
	// ukoliko korisnik unese karakter E program mu vraća 69 kao unicode za taj
	// karakter.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo karakter od korisnika
			System.out.println("Unesite karakter: ");
			String character = input.nextLine();
			// ograničavamo unos na samo jedan karakter
			if (character.length() == 1) {
				int unicode = character.charAt(0);
				// Ispisujemo Unicode karakter za dati broj
				System.out.println("Unicode za karakter " + character + " je " + unicode);
			} else {
				System.out.println("Molimo unesite samo jedan karakter.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

}
