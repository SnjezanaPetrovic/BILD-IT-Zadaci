package zadaci_08_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
	// Napisati sljedeću metodu koja vraća najveću vrijednosti u ArrayListu
	// Integera.
	// Metoda vraća null ukoliko je lista null ili ukoliko lista sadrži 0
	// elemenata.
	// public static Integer max(ArrayList<Integer> list)

	public static void main(String[] args) {
		// Napravimo listu
		ArrayList<Integer> list = new ArrayList<>();

		// Da bi testirali metodu uzeti ćemo neke vrijednosti od korisnika i
		// staviti u listu
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijele brojeve u listu (0 prekida unos): ");
		int number = 0;
		do {
			number = input.nextInt();
			list.add(number);
		} while (number != 0);
		// Ispisujemo rezultat
		System.out.println("Najveća vrijednost u listi je: " + max(list));
		input.close();

	}

	// Metoda koja vraća najveću vrijednost u listi
	public static Integer max(ArrayList<Integer> list) {

		if (list != null) {
			int greatest = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > greatest) {
					greatest = list.get(i);

				}

			}
			return greatest;

		}
		return null;

	}

}
