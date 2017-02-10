package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	// Napisati metodu koja prima 2 argumenta: početni broj i krajnji broj te
	// printa sve proste brojeve u zadanom rangu.
	// BONUS: metoda može primati i treći argument, broj brojeva za isprintati
	// po liniji.

	public static void main(String[] args) {

		// Uzimamo od korisnika početni,krajnji i broj koji odredjuje koliko će
		// brojeva biti u jednom redu
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite početni broj: ");
		int num1 = input.nextInt();
		System.out.println("Unesite krajnji broj: ");
		int num2 = input.nextInt();
		System.out.println("Unesite količinu brojeva u redu: ");
		int numberPerRow = input.nextInt();
		input.close();

		// Pozivamo metodu da ispiše sve proste brojeve u tom rasponu
		try {
			printPrime(num1, num2, numberPerRow);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

	// etoda koja ispisuje proste brojeve tako što za svaki broj u datom rasponu
	// provjerava da li je prosti i ispisuje ga ako jeste
	public static void printPrime(int num1, int num2, int numberPerRow) {

		int count = 0;
		for (int i = num1; i <= num2; i++) {
			// Posto 1 nije prost broj moramo ga isključiti u slučaju da ga
			// korisnik unese kao početni
			if (isPrime(i) && i > 1) {
				count++;
				System.out.printf("%5d", i);
				// odredjujemo broj brojeva u redu(ovo zvuči glupo)
				if (count % numberPerRow == 0) {
					System.out.println();
				}
			}

		}

	}

	// Metoda koja provjerava da li je broj prost
	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

}
