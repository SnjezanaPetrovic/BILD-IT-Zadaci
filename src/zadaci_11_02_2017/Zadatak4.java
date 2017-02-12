package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati metodu koja printa 100 nasumičnih uppercase karaktera i 100
	// nasumičnih brojeva, 10 po liniji.

	// Ja sa dodala da može korisnik sam upisati koliko slova i brojeva želi da
	// mu bude generisano umjesto ovih fiksnih 100 što piše u zadatku

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo broj slova i brojeva od korisnika
			System.out.println("Koliko velikih slova želite da bude generisano? ");
			int numOfLetters = input.nextInt();
			System.out.println("Koliko brojeva želite da bude generisano? ");
			int numOfNumbers = input.nextInt();
			// Pozivamo metodu koja ispisuje slova i brojeve

			printNumAndChar(numOfLetters, numOfNumbers);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	// Metoda koja prima dva argumenta:broj slova i broj brojeva koji trebaju
	// biti nasumicno generisani i ispisuje ih 10 po liniji
	public static void printNumAndChar(int numOfLetters, int numOfNumbers) {

		int count = 0;
		for (int i = 0; i < (numOfLetters + numOfNumbers); i++) {
			count++;
			if (i < numOfLetters) {
				// ASCI uppercase karakteri imaju vrijednosti od 65 za A do 90
				// za Z
				System.out.print((char) ((int) ((Math.random() * 26) + 65)) + " ");

			} else {
				System.out.print((int) (1 + Math.random() * 9) + " ");

			}
			if (count % 10 == 0) {
				System.out.println();
			}

		}

	}

}
