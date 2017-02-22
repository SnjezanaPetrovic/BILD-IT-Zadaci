package zadaci_22_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati metodu koja izračunava zbir svih brojeva u cijelom broju.
	// Koristite sljedeći header: public static int sumDigits(long n). Na
	// primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234))
	// metoda treba da vrati 9. (2 + 3 + 4 = 9)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo broj od korisnika
			System.out.println("Unesite cijeli broj: ");
			long n = input.nextLong();
			System.out.println("Suma svih cifara je " + sumDigits(n));

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite cijeli broj.");
		}
		input.close();

	}

	// Metoda koja sabira cifre i vraća apsolutnu vrijednost sume
	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			long digit = n % 10;
			sum += digit;
			n /= 10;
		}
		return Math.abs(sum);

	}

}
