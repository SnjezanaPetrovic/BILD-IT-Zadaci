package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati program koji pita korisnika da unese dva stringa te provjerava i
	// ispisuje da li je drugi string substring prvog stringa. Na primjer,
	// ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program
	// mu ispisuje da je BC substring ABCD stringa.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite prvi string: ");
			String str1 = input.nextLine();
			System.out.println("Unesite drugi string: ");
			String str2 = input.nextLine();

			if (str1.contains(str2)) {
				System.out.println("Drugi string je substring prvog stringa.");
			} else {
				System.out.println("Drugi string nije substring prvog stringa.");
			}

			input.close();

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

}
