package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napisati metodu koja nalazi najmanji element u nizu decimalnih
	// vrijednosti koristeći se sljedećim headerom:
	//
	// public static double min(double[ ] array)
	//
	// Napišite potom test program koji pita korisnika da unese deset brojeva te
	// poziva ovu metodu da vrati najmanji element u nizu.

	public static void main(String[] args) {

		// Napravimo niz od 10 elemenata
		double[] array = new double[10];

		// Uzmemo vrijednosti elemenata od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 decimalnih brojeva: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();

		}
		input.close();

		// Pozivamo metodu koja pronalazi najmanji element i ispisujemo ga
		try {
			double smalest = min(array);
			System.out.println("Najmanji element u nizu je " + smalest);
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

	// Metoda koja pronalazi najmanji element
	public static double min(double[] array) {

		double smalest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smalest) {
				smalest = array[i];
			}

		}
		return smalest;
	}

}
