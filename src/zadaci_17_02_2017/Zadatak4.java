package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati metodu koja pronalazi broj ponavljanja određenog karaktera u
	// stringu. Metoda treba da koristi sljedeći header: public static int
	// count(String str, char a). Na primjer, ukoliko pozovemo metodu na
	// sljedeći način: count("Welcome", e) metoda treba da vrati 2. Napisati
	// program koji pita korisnika da unese string i koji karakter želi da
	// prebroji u datom stringu te mu ispiše koliko se puta određeni karakter
	// ponovio u zadatom stringu.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite string: ");
			String str = input.nextLine();
			System.out.println("Unesite karakter koji želite da prebrojite: ");
			String ch = input.nextLine();
			if (ch.length() > 1) {
				System.out.println("Pogrešan unos.Unesite samo jedan karakter.");
			} else {
				char a = ch.charAt(0);
				System.out.println("Karakter se u stringu ponavlja " + count(str, a) + " puta.");
			}

			input.close();

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

	public static int count(String str, char a) {

		int countChar = 0;
		for (int i = 0; i < str.length(); i++) {

			if (a == str.charAt(i)) {
				countChar++;

			}
		}
		return countChar;

	}

}
