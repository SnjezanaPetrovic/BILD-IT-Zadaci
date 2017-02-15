package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	// Napisati program koji ispisuje tri nasumična cijela broja te pita
	// korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
	// ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik
	// unese tačan odgovor, program mu čestita i završava sa radom.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			boolean answer = false;
			while (!answer) {
				// Generišemo 3 nasumična broja
				int num1 = (int) (Math.random() * 10);
				int num2 = (int) (Math.random() * 10);
				int num3 = (int) (Math.random() * 10);
				// Postavljamo pitanje korisniku
				System.out.println("Koliko je " + num1 + "+" + num2 + "+" + num3 + "?");
				int result = input.nextInt();
				// Ako je rezultat tačan čestitamo i podešavamo boolean
				// vrijednost na true da bi završili program
				if (result == (num1 + num2 + num3)) {
					System.out.println("Unijeli ste tačan odgovor.Čestitamo!");
					answer = true;
					// ako nije tačan podešavamo boolean na false da bi petlja
					// nastavila
				} else {
					System.out.println("Odgovor nije tačan.Pokušajte ponovo.");
					answer = false;
				}
			}
			input.close();

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

}
