package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati program koji pita korisnika da unese cijeli broj te ispisuje
	// piramidu svih brojeva do tog broja.
	// (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod
	// vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4
	// itd.)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// Uzimamo broj od korisnika
			System.out.println("Unesite cijeli pozitivan broj manji od 100: ");
			int number = input.nextInt();
			// provjeravamo da li je broj pozitivan
			if (number > 0 && number <= 100) {
				displayPyramid(number);
			} else {
				System.out.println("Broj mora biti pozitivan i manji od 100 .");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Unesite cijeli pozitivan broj manji od 100.");
			input.nextLine();
		}
		input.close();

	}

	public static void displayPyramid(int num) {

		for (int i = 1; i <= num; i++) {
			// petlja za razmake
			for (int j = num; j > i; j--) {
				System.out.print("     ");
			}
			// petlja za lijevu stranu piramide
			for (int k = i; k >= 1; k--) {
				System.out.printf("%5d", k);
			}
			// petlja za desnu stranu piramide
			for (int z = 1; z < i; z++) {
				System.out.printf("%5d", (z + 1));
			}
			System.out.println();
		}
	}

}
