package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// Napisati metodu sa sljedećim headerom koja ispisuje tri broja u rastućem
	// redosljedu: public static void displaySortedNumbers(double num1, double
	// num2, double num3). Napisati program koji pita korisnika da unese tri
	// broja te ispiše ta tri broja u rastućem redosljedu.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Uzimamo brojeve od korisnika
		try {
			System.out.println("Unesite tri decimalna broja: ");
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num3 = input.nextDouble();

			// Pozivamo metodu koja ispisuje brojeve u rastucem redosljedu
			displaySortedNumbers(num1, num2, num3);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		// Napravimo niz i ubacimo u njega date brojeve
		double[] array = { num1, num2, num3 };

		// Sortiramo niz

		java.util.Arrays.sort(array);

		// Ispisemo sortiran niz
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}

}
