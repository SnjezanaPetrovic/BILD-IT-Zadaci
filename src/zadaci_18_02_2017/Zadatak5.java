package zadaci_18_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati program koji učitava neodređen broj cijelih brojeva, određuje
	// koliko je pozitivnih brojeva korisnik unijeo, koliko negativnih te
	// izračunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida
	// unos tako što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0
	// program treba da ispiše da je broj pozitivnih brojeva 3, negativnih
	// brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double sum = 0;
		int countPos = 0;
		int countNeg = 0;

		try {
			// Uzimamo vrijednosti od korisnika i brojimo koliko ima pozitivnih
			// a koliko negativnih
			System.out.println("Unosite cijele brojeve (0 prekida unos): ");
			int num = input.nextInt();
			// petlja se vrti dok unesena vrijednost nije 0
			do {
				if (num > 0) {
					countPos++;
				} else if (num < 0) {
					countNeg++;
				}
				// sabiramo brojeve da dobijemo sumu
				sum += num;
				num = input.nextInt();

			} while (num != 0);
			// Izračunavamo prosjek i ispisujemo rezultate
			double average = sum / (countPos + countNeg);
			System.out.println("Broj pozitivnih brojeva je " + countPos + " a negativnih " + countNeg);
			System.out.println("Suma svih brojeva je " + sum + " a prosjek je " + average);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unosite cijele brojeve.");
		}
		input.close();

	}

}
