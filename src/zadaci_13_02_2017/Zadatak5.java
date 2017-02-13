package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati metodu koja broji slova u stringu. Metoda treba koristiti
	// sljedeći header: public static int countLetters(String s). Napisati
	// program koji pita korisnika da unese neki string te mu vrati koliko taj
	// string ima slova.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Uzimamo string od korisnika i pozivamo metodu koja broji slova
		try {
			System.out.println("Unesite neki string: ");
			String s = input.nextLine();
			System.out.println("U stringu ima " + countLetters(s) + " slova");

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	// metoda koja ispituje da li je karakter slovo i ako jeste broji ih
	public static int countLetters(String s) {

		int numberOfLetters = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				numberOfLetters++;
			}

		}
		return numberOfLetters;
	}

}
