package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
	// Napisati program koji učitava 10 brojeva te ispisuje koilko je
	// jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
	// razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
	// broj treba ispisati samo jednom.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		try {
			// Uzimamo brojeve od korisnika i smještamo ih u ArrayList-u
			System.out.println("Unesite 10 cijelih brojeva: ");
			for (int i = 0; i < 10; i++) {
				int num = input.nextInt();
				list.add(num);
			}
			// osiguravamo se da broj unesenih brojeva može biti jedino 10

			int count = 0;
			// provjeravamo da li ima brojeva koji se ponavljaju
			for (int i = 0; i < list.size(); i++) {
				boolean unique = true;
				for (int j = 0; j < i; j++) {
					if (list.get(i) == list.get(j)) {
						unique = false;
						break;
					}
				}
				// ako je broj jedinstven ispisujemo ga i brojimo
				if (unique) {
					count++;
					System.out.print(list.get(i) + " ");
				}
			}
			// Ispisujemo rezultat
			System.out.println("Unijeli ste " + count + " jedinstvenih brojeva.");

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite cijele brojeve.");
		}
		input.close();

	}

}
