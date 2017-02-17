package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadaci4 {
	// Napišite program koji učitava neodređen broj cijelih brojeva (unos
	// prekida nula), pronalazi najveći od unijetih brojeva te ispisuje koliko
	// se najveći broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0
	// program ispisuje da je najveći broj 5 te ispisuje da se isti ponavlja 4
	// puta.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unosite cijele brojeve (unos prekida 0): ");
			int num = input.nextInt();
			int bigestNum =num;
			int countBigest = 1;
			do {
				num = input.nextInt();
				if (num == 0) {
					break;
				}

				if (num > bigestNum) {
					bigestNum = num;

				} else if (num == bigestNum) {
					countBigest++;
				}

			} while (num != 0);
			System.out
					.println("Najveći broj od unesenih je " + bigestNum + " i pojavljuje se " + countBigest + " puta.");

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

}
