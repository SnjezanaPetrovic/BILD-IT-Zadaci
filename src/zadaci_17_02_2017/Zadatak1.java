package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	// Napisati metodu koja vraća broj dana u godini. Metoda koristi sljedeći
	// header: public static int numberOfDayInAYear(int year). Napisati program
	// koji pita korisnika da unese početnu godinu, krajnju godinu te ispisuje
	// broj dana za svaku godinu u rasponu.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite početnu godinu: ");
			int startYear = input.nextInt();
			System.out.println("Unesite krajnju godinu: ");
			int finishYear = input.nextInt();
			if (startYear > finishYear) {
				for (int i = startYear; i >= finishYear; i--) {
					System.out.println(i + " godina-" + numberOfDayInAYear(i) + " dana");
				}
			} else {
				for (int i = startYear; i <= finishYear; i++) {
					System.out.println(i + " godina-" + numberOfDayInAYear(i) + " dana");
				}
			}

			input.close();

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

	public static int numberOfDayInAYear(int year) {

		if (year >= -45 && isLeapYear(year)) {
			return 366;
		} else {
			return 365;
		}

	}

	public static boolean isLeapYear(int year) {

		// Odredjujemo da li je godina prestupna
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

	}

}
