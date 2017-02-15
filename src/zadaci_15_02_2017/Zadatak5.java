package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Neke web stranice forsiraju određena pravila za passworde. Napisati
	// metodu koja provjerava da li je unijeti string validan password. Pravila
	// da bi password bio validan su sljedeća: 1. Password mora biti sačinjen od
	// najmanje 8 karaktera. 2. Password smije da se sastoji samo od slova i
	// brojeva. 3. Password mora sadržati najmanje 2 broja. Napisati program
	// koji pita korisnika da unese password te mu ispisuje "password je
	// validan" ukoliko su sva pravila ispoštovana ili "password nije validan"
	// ukoliko pravila nisu ispoštovana.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Uzimamo lozinku od korisnika i pozivamo metodu koja ispituje da li je
		// lozinka validna ili ne
		try {
			System.out.println("Unesite lozinku: ");
			String password = input.nextLine();

			if (isValidPassword(password)) {
				System.out.println("Lozinka je validna.");
			} else {
				System.out.println("Lozinka nije validna.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static boolean isValidPassword(String password) {

		int countDigit = 0;
		// ako je lozinka kraća od 8 karaktera onda nije validna
		if (password.length() < 8) {
			return false;
		}
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			// ako sadrži karaktere koji nisu slova ili brojevi onda nije
			// validna
			if (!Character.isLetterOrDigit(ch)) {
				return false;
			}
			// brojimo koliko karaktera su brojevi
			if (Character.isDigit(ch)) {
				countDigit++;
			}
		}
		// ako ima 2 ili više broja onda je validna a ako ne onda nije
		if (countDigit >= 2) {
			return true;
		} else {
			return false;
		}

	}

}
