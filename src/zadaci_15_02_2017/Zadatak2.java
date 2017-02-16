package zadaci_15_02_2017;

import java.util.GregorianCalendar;
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
				String nameOfTheMonth = getNameOfTheMonth(month);

				System.out.println(nameOfTheMonth + " " + year + " " + printPastFuture(month, year) + " "
						+ getNumberOfDays(month, year) + " dan/a.");
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

	// Metoda koja vraća ime mjeseca
	public static String getNameOfTheMonth(int month) {

		String nameOfTheMonth = "";

		switch (month) {
		case 1:
			nameOfTheMonth = "Januar";
			break;
		case 2:
			nameOfTheMonth = "Februar";
			break;
		case 3:
			nameOfTheMonth = "Mart";
			break;
		case 4:
			nameOfTheMonth = "April";
			break;
		case 5:
			nameOfTheMonth = "Maj";
			break;
		case 6:
			nameOfTheMonth = "Jun";
			break;
		case 7:
			nameOfTheMonth = "Juli";
			break;
		case 8:
			nameOfTheMonth = "Avgust";
			break;
		case 9:
			nameOfTheMonth = "Septembar";
			break;
		case 10:
			nameOfTheMonth = "Oktobar";
			break;
		case 11:
			nameOfTheMonth = "Novembar";
			break;
		case 12:
			nameOfTheMonth = "Decembar";
			break;

		}
		return nameOfTheMonth;

	}

	public static String printPastFuture(int month, int year) {

		GregorianCalendar currentTime = new GregorianCalendar();
		if (month > currentTime.get(GregorianCalendar.MONTH) + 1 && year >= currentTime.get(GregorianCalendar.YEAR)) {
			return "će imati";
		} else {
			return "je imao";
		}

	}

}
