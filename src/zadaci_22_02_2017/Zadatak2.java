package zadaci_22_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napisati program koji igra sa protivnikom rock-paper-scissors.
	// (papir-bunar-makaze ili tako nekako po naški) Program nasumično generiše
	// brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
	// korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
	// pobijedio, da li je računar pobijedio ili je bilo neriješeno.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			// računar odredjuje random broj 0,1 ili 2
			int num = (int) (Math.random() * 3);
			// Uzimamo izbor korisnika
			System.out.println("Unesite 0 (papir),1 (bunar) ili 2 (makaze): ");
			int choice = input.nextInt();
			if (choice >= 0 && choice < 3) {
				game(choice, num);

			} else {
				System.out.println("Došlo je do greške.Molimo unesite 0 (papir),1 (bunar) ili 2 (makaze).");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite 0 (papir),1 (bunar) ili 2 (makaze).");
		}
		input.close();

	}

	public static void game(int choice, int num) {
		// ispisujemo šta je računar dobio random selekcijom
		System.out.print("Računar je izabrao: ");

		switch (num) {
		case 0:
			System.out.println("papir");
			break;
		case 1:
			System.out.println("bunar");
			break;
		case 2:
			System.out.println("makaze");
			break;
		}
		// poredimo izbor korisnika i računara te ispisujemo rezultat
		switch (num) {
		case 0:
			if (choice == 0) {
				System.out.println("Rezultat je izjednačen");
			} else if (choice == 1) {
				System.out.println("Kompjuter pobjedjuje.");
			} else {
				System.out.println("Vi pobjedjujete");
			}
			break;
		case 1:
			if (choice == 0) {
				System.out.println("Vi pobjedjujete");
			} else if (choice == 1) {
				System.out.println("Rezultat je izjednačen");
			} else {
				System.out.println("Kompjuter pobjedjuje.");
			}
			break;
		case 2:
			if (choice == 0) {
				System.out.println("Kompjuter pobjedjuje.");
			} else if (choice == 1) {
				System.out.println("Vi pobjedjujete");
			} else {
				System.out.println("Rezultat je izjednačen");
			}
			break;

		}

	}
}
