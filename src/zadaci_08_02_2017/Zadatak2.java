package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Pretpostavimo da su slova A, E, I, O i U samoglasnici.
	// Napisati program koji pita korisnika da unese string te mu ispište broj
	// samoglasnika i suglasnika u datom stringu.

	public static void main(String[] args) {

		// Uzimamo string od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		input.close();
		int countLetter = 0;
		int countVowels = 0;

		// Prolazimo kroz string i provjeravamo da li su karakteri u stringu
		// slova i da li su samoglasnici.Ako jesu brojimo ih.
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String letter = ch + "";
			if (Character.isLetter(ch)) {
				countLetter++;
				if ("aeiou".contains(letter.toLowerCase())) {
					countVowels++;

				}

			}

		}
		//Ispisujemo rezultat
		System.out.println("U datom stringu ima " + countVowels + " samoglasnika i " + (countLetter - countVowels)
				+ " suglasnika");

	}

}
