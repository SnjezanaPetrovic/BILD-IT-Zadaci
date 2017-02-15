package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napisati program koji pita korisnika da unese mjesec i godinu te mu
	// ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao
	// godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012
	// imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3,
	// program treba ispisati da je Mart 2015 imao 31 dan.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Uzimamo od korisnika godinu i mjesec
		try {
			System.out.println("Unesite godinu: ");
			int year = input.nextInt();
			System.out.println("Unesite mjesec u formi broja od 1 do 12: ");
			int month = input.nextInt();
			// Ispisujemo rezultat
			if (month < 1 || month > 12) {
				System.out.println("Niste dobro unijeli mjesec.");
			} else {
				System.out.println("Broj dana u mjesecu je: " + getNumberOfDays(month, year));
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static int getNumberOfDays(int month, int year) {

		// Odredjujemo koliko mjesec ima dana
		if (month == 2) {
			// Ako je februar prestupne godine ima 29 a inace 28
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;

		} else {
			return 30;
		}
	}

	public static boolean isLeapYear(int year) {

		// Odredjujemo da li je godina prestupna
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

	}

}
