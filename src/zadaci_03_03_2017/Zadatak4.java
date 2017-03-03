package zadaci_03_03_2017;

import java.util.Scanner;

public class Zadatak4 {
	// (Displaying the prime factors) Write a program that prompts the user to
	// enter
	// a positive integer and displays all its smallest factors in decreasing
	// order. For
	// example, if the integer is 120, the smallest factors are displayed as 5,
	// 3, 2, 2,
	// 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3,
	// 5) and
	// retrieve and display them in reverse order.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		StackOfIntegers smallestFactor = new StackOfIntegers();

		try {
			// uzimamo vrijednost od korisnika
			System.out.println("Enter an integer: ");
			int number = input.nextInt();

			// Vrsimo validaciju da li je broj veci od 0
			if (number <= 0) {
				System.out.println("Number has to be bigger than 0.");
			} else {
				// Ako je broj 1 faktor je 1
				if (number == 1) {
					System.out.println("Factor of the 1 is 1.");
				} else {
					// pronalazimo faktore i smještamo ih u stack
					for (int i = 2; i <= number; i++) {
						while (number % i == 0) {
							smallestFactor.push(i);
							number /= i;
						}
					}
				}

			}
			// ispisujemo vrijednosti koje smo ubacili u stack obrnutim
			// redosljedom
			while (smallestFactor.getSize() != 0) {
				System.out.print(smallestFactor.pop() + " ");
			}

		} catch (Exception ex) {
			System.out.println("Error.Please enter an integer.");
		}
		input.close();

	}

}
