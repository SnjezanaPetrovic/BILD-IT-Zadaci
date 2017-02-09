package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	static Scanner input = new Scanner(System.in);
	// Napisati metodu koja prima jedan argument, broj pitanja, te generiše
	// toliko
	// nasumičnih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“.
	// Metoda treba da broji broj tačnih i netačnih odgovora te ih ispiše
	// korisniku.

	public static void main(String[] args) {
		// odredjujemo broj pitanja i pozivamo metodu
		System.out.println("Unesite broj pitanja: ");
		int numOfQuestions = input.nextInt();
		try {
			generateQuestions(numOfQuestions);

		} catch (Exception ex) {

			System.out.println("Došlo je do greške.Unos mora biti cijeli broj.");

		}

	}

	public static void generateQuestions(int numOfQuestions) {

		int countTrue = 0;

		for (int i = 0; i < numOfQuestions; i++) {
			// generišemo nasumično dva broja i ako je prvi manji zamijenimo im
			// mjesta
			int num1 = (int) (1 + Math.random() * 10);
			int num2 = (int) (1 + Math.random() * 10);
			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			// Postavimo pitanje korisniku te uzimamo rezultat od njega
			System.out.println("Koliko je " + num1 + "-" + num2 + " ? ");
			int answer = input.nextInt();
			// Ako je rezultat tačan brojimo ga
			if (answer == (num1 - num2)) {
				countTrue++;
			}

		}
		input.close();
		// Ispisujemo koliko je bilo tačnih rezultata
		System.out.println(
				"Odgovorili ste " + countTrue + " puta tačno i " + (numOfQuestions - countTrue) + " puta netačno");
	}

}
