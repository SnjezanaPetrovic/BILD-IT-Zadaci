package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom
	// redosljedu.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Napravimo niz,u njega ubacimo brojeve i ispisemo niz od zadnjeg
		// elementa do prvog
		int[] numbers = new int[10];

		try {

			System.out.println("Unesite 10 cijelih brojeva: ");
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = input.nextInt();

			}

			for (int i = numbers.length - 1; i >= 0; i--) {
				System.out.print(numbers[i] + " ");

			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();
	}

}
