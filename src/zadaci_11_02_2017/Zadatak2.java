package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1
	// d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum i
	// njega izračunavamo iz prvih devet brojeva koristeći se sljedećom
	// formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 +
	// d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji broj označavamo sa
	// X u skladu sa ISBN-10 konvencijom. Napisati program koji pita korisnika
	// da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. (Primjer:
	// ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje
	// 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9
	// brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite 9 cifara bez razmaka: ");
			String isbn = input.nextLine();

			int sum = 0;
			if (isValidIsbn(isbn)) {
				for (int i = 0; i < isbn.length(); i++) {
					int digit = Integer.parseInt(isbn.charAt(i) + "");
					sum += digit * (i + 1);

				}
				if (sum % 11 == 10) {
					System.out.println(isbn + "X");
				} else {
					int d10 = sum % 11;
					System.out.println(isbn + "" + d10);
				}

			} else {
				System.out.println("Unos nije dobar.Unesite 9 cifara bez razmaka.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static boolean isValidIsbn(String isbn) {

		if (isbn.length() != 9) {
			return false;
		}
		for (int i = 0; i < isbn.length(); i++) {
			if (!Character.isDigit(isbn.charAt(i))) {
				return false;
			}

		}
		return true;
	}

}
