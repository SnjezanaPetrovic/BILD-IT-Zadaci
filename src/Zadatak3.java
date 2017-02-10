package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {
	// Nizovi niz1 i niz2 su striktno identični ukoliko su svi njihovi elementi
	// na istim pozicijama jednaki. Napisati metodu koja vraća true ukoliko su
	// nizovi niz1 i niz2 striktno identični. Koristiti sljedeći header:
	//
	// public static boolean equals(int[ ] niz1, int[ ] niz2)
	//
	// Napisati testni program koji pita korisnika da unese dva niza cijelih
	// brojeva te provjerava da li su striktno identični.

	public static void main(String[] args) {

		// Uzmemo od korisnika dužinu nizova
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dužinu nizova: ");
		int numOfElements = input.nextInt();

		// Napravimo prvi niz i uzmemo od korisnika vrijednosti elemenata
		int[] array1 = new int[numOfElements];
		System.out.println("Upišite vrijednosti u prvi niz: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}

		// Napravimo drugi niz i uzmemo od korisnika vrijednosti elemenata
		int[] array2 = new int[numOfElements];
		System.out.println("Upišite vrijednosti u drugi niz: ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();
		}
		input.close();

		try {
			if (equals(array1, array2)) {
				System.out.println("Nizovi su jednaki.");
			} else {
				System.out.println("Nizovi nisu jednaki");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

	// Metoda koja poredi dva niza i vraća true ako su jednaki a false ako nisu
	public static boolean equals(int[] niz1, int[] niz2) {

		if (Arrays.equals(niz1, niz2)) {
			return true;
		} else {
			return false;
		}

	}

}
