package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
	// rasponu godina koje korisnik unese. Program pita korisnika da unese
	// početnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
	// Razmak između godina treba biti jedan space.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite početnu godinu: ");
			int year1 = input.nextInt();
			System.out.println("Unesite krajnju godinu: ");
			int year2 = input.nextInt();
			if (year1 > year2) {
				System.out.println("Početna godina mora biti manja od krajnje.");
			} else if (year1 < -45) {
				System.out.println("Prestupne godine se računaju samo od 45g. p.n.e.");
			} else {
				printLeapYears(year1, year2);
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	public static boolean isLeapYear(int year) {

		// Odredjujemo da li je godina prestupna
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

	}

	public static void printLeapYears(int year1, int year2) {

		int count = 0;

		for (int i = year1; i <= year2; i++) {
			if (isLeapYear(i)) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

}
