package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// Napisati metodu koja prima dva cijela broja kao argumente te vraća
	// najveći
	// zajednički djelilac za ta dva broja.
	// PRIMJER:
	// Unesite prvi broj: 125
	// Unesite drugi broj: 2525
	// Najveći zajednički djelilac za brojeve 125 i 2525 je 25.

	public static void main(String[] args) {
		// Uzimamo dva broja od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int num1 = input.nextInt();
		System.out.println("Unesite drugi broj: ");
		int num2 = input.nextInt();
		// Pozivamo metodu i ispisujemo rezultat
		System.out.println(
				"Najveći zajednički djelilac za brojeve " + num1 + " i " + num2 + " je " + greatestDivisor(num1, num2));
		input.close();

	}

	// metoda koja prima dva cijela broja kao argumente te vraća
	// najveći
	public static int greatestDivisor(int num1, int num2) {

		int greatestDivisor = 0;
		// Useti ćemo da je prvi manji a ako nije onda im zamjenimo mjesta
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// Idemo od manjeg broja prema nuli i prvi sa kojim su oba broja
		// djeljiva je najveći zajednički djelilac
		for (int i = num1; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				greatestDivisor = i;
				break;

			}
		}
		return greatestDivisor;

	}

}
