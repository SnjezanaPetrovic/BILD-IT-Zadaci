package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati program koji učitava neodređeni broj cijelih brojeva (nula
	// prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
	// prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka.
	// Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti
	// 100.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo vrijednosti od korisnika
			System.out.println("Unosite cijele brojeve (0 prekida unos): ");

			// Pravimo niz koji sadrzi 100 elemenata jer je to maksimalno koliko
			// moze korisnik unijeti
			int[] arrayOfNumbers = new int[100];

			int count = 0;
			double sum = 0;
			double average = 0;
			int countAboveAverage = 0;

			// Dobijene vrijednosti smjestamo u niz
			for (int i = 0; i < arrayOfNumbers.length; i++) {
				arrayOfNumbers[i] = input.nextInt();
				// Ako korisnik unese 0 prekidamo iteraciju
				if (arrayOfNumbers[i] == 0) {
					break;
					// brojimo koliko smo vrijednosti unijeli da bi mogli
					// izracunati sumu te izracunavamo sumu
				} else {
					count++;
					sum += arrayOfNumbers[i];
				}

			}
			input.close();
			// Izracunavamo prosjek
			average = sum / count;

			// Prolazimo ponovo kroz brojeve i brojimo koji su iznad ili jednaki
			// prosjeku
			for (int i = 0; i < count; i++) {
				if (arrayOfNumbers[i] >= average) {
					countAboveAverage++;
				}

			}
			// Ispisujemo rezultate
			System.out.println("Unijeli ste " + countAboveAverage + " brojeva iznad ili jednakih " + "prosjeku a "
					+ (count - countAboveAverage) + " brojeva ispod prosjeka.");

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

}
