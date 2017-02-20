package zadaci_20_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napisati program koji pita korisnika da unese dva cijela, pozitivna broja
	// te ispisuje najveći i najmanji zajednički djelilac za ta dva broja.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite prvi broj: ");
			long num1 = input.nextInt();
			System.out.println("Unesite drugi broj: ");
			long num2 = input.nextInt();

			long greatestCommonDivisor = 1;
			long lowestCommonDivisor = 1;
			long count = 0;
			if (num1 > 0 && num2 > 0) {
				if (num1 > num2) {
					long temp = num1;
					num1 = num2;
					num2 = temp;
				}
				for (int i = 2; i <= num1; i++) {
					if (num1 % i == 0 && num2 % i == 0) {
						count++;
						greatestCommonDivisor = i;
						if (count == 1) {
							lowestCommonDivisor = i;
						}
					}
				}
				System.out.println("Najveći zajednički djelilac je " + greatestCommonDivisor);
				System.out.println("Najmanji zajednički djelilac je " + lowestCommonDivisor);

			} else {
				System.out.println("Molimo unesite pozitivne brojeve.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite cijele brojeve.");
		}
		input.close();

	}

}
