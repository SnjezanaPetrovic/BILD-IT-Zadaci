package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napisati program koji pita korisnika da unese neki string te mu ispisuje
	// dužinu tog stringa kao i prvo slovo stringa.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {
			// Uzimamo string od korisnika
			System.out.println("Unesite neki string: ");
			String str = input.nextLine();
			System.out.print("Dužina stringa je " + str.length() + " a prvo slovo je: " + firstLetter(str));

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	// pronalazimo prvi karakter koji je slovo i ispisujemo ga ako postoji
	public static String firstLetter(String str) {
		String letter = "Nepostojeći";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				letter = ch + "";
				break;
			}
		}
		return letter;
	}

}
