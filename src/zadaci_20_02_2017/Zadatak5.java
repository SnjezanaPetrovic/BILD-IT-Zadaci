package zadaci_20_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati program koji učitava cijele brojeve u rasponu od 1 do 100 te
	// broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula
	// prekida unos brojeva. Ukoliko unesemo sljedeći niz brojeva 2 5 6 23 42 58
	// 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom,
	// broj 6 2 puta, broj 23 jednom, itd.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[101];
		try {
			System.out.println("Unosite cijele brojeve u rasponu od 1 do 100 (0 prekida unos): ");
			int num = input.nextInt();
			do {
				array[num]++;
				num = input.nextInt();
			} while (num != 0);

			for (int i = 1; i < array.length; i++) {
				if (array[i] > 0) {
					System.out.println("Broj " + i + " se pojavljuje " + array[i] + " " + timeTimes(array[i]));
				}

			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite cijele brojeve u rasponu od 1 do 100.");
		}
		input.close();

	}

	public static String timeTimes(int number) {

		if (number == 1) {
			return "put";
		} else {
			return "puta";
		}
	}

}
