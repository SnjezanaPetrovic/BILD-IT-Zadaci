package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati program koji učitava niz brojeva, pronalazi najveći broj te
	// ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
	// brojeva
	// završava sa nulom.

	public static void main(String[] args) {

		// Uzimamo brojeve od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println("Unosite cijele brojeve (0 prekida unos); ");
		int number = 0;
		int greatestNumber = 0;
		int count = 0;
		// Dok god broj nije 0 poredimo brojeve i tražimo najveći a ako se
		// ponavlja onda brojimo koliko puta
		do {
			number = input.nextInt();
			if (number > greatestNumber) {
				greatestNumber = number;
				count = 1;
			} else if (number == greatestNumber) {
				count++;
			}

		} while (number != 0);
		input.close();
		// Ispisujemo rezultat
		System.out.println("Najveći broj od unesenih je " + greatestNumber + " i ponavlja se " + count + " puta");

	}

}
