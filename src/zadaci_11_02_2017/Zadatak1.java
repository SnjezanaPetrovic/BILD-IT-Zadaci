package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	// Napisati program koji pita korisnika da unese neki cijeli broj te
	// ispisuje njegove najmanje faktore u rastućem redosljedu. Na primjer,
	// ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2
	// * 2 * 3 * 5 = 120)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Uzimamo broj od korisnika
		try {
			System.out.println("Unesite neki cijeli broj: ");
			int number = input.nextInt();

			//Vršimo validaciju da li je broj veci od 0
			if (number <= 0) {
				System.out.println("Broj mora biti veći od 0.");
			} else {
				//Ako je broj 1 faktor je 1
				if (number == 1) {
					System.out.println("Faktor broja 1 je 1.");
				} else {
					// Pronalazimo faktore broja i ispisujemo ih korisniku
					System.out.println("Faktori broja " + number + " su: ");
					for (int i = 2; i <= number; i++) {
						while (number % i == 0) {
							System.out.print(i + " ");
							number /= i;
						}
					}
				}
			}

		} catch (Exception ex) {
			System.out.println("Unesite cijeli broj.");
		}
		input.close();

	}

}
