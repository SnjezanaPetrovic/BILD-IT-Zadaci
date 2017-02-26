package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// Pattern recognition: consecutive four equal numbers) Write the following
	// method that tests whether the array has four consecutive numbers with the
	// same
	// value.
	// public static boolean isConsecutiveFour(int[] values)
	// Write a test program that prompts the user to enter a series of integers
	// and dis-
	// plays if the series contains four consecutive numbers with the same
	// value. Your
	// program should first prompt the user to enter the input size—i.e., the
	// number of
	// values in the series

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo vrijednosti od korisnika
			System.out.println("Enter the number of values: ");
			int numOfValues = input.nextInt();
			// dužina niza mora biti veća od 0 i manja od 50
			if (numOfValues > 4 && numOfValues < 50) {
				int[] array = new int[numOfValues];
				System.out.println("Enter the values: ");
				for (int i = 0; i < array.length; i++) {
					array[i] = input.nextInt();
				}
				// ako ima 4 iste uzastopne vrijednosti ispisujemo da ima a ako
				// nema ispisujemo da nema
				if (isConsecutiveFour(array)) {
					System.out.println("The list has consecutive four.");
				} else {
					System.out.println("The list has no consecutive four.");
				}

			} else {
				System.out.println("Please input numbers bigger than 4 and smaller than 50.");
			}

		} catch (Exception ex) {
			System.out.println("Error.Please input integeres.");
		}
		input.close();

	}

	// Metoda koja provjerava da li u proslijedjenom nizu ima 4 uzastopne iste
	// vrijednosti
	public static boolean isConsecutiveFour(int[] values) {

		for (int i = 0; i < values.length - 3; i++) {
			if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
				return true;
			}

		}
		return false;

	}

}
