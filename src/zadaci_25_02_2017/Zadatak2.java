package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// (Random number chooser) Write a method that returns a random number
	// between
	// 1 and 54, excluding the numbers passed in the argument. The method header
	// is
	// specified as follows:
	// public static int getRandom(int... numbers)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// uzimamo dužinu niza od korisnika
			System.out.println("Enter the size of the array: ");
			int arraySize = input.nextInt();
			// dužina niza mora biti u granicama od 0 do 54
			if (arraySize > 0 && arraySize < 54) {
				// unosimo vrijednosti u niz
				System.out.println("Enter values into array: ");
				int[] array = new int[arraySize];
				boolean isValid = true;
				for (int i = 0; i < array.length; i++) {
					array[i] = input.nextInt();
					if (array[i] <= 0 || array[i] > 54) {
						System.out.println("Error.Please enter integer between 1 and 54.");
						isValid = false;
					}
				}
				// ako su vrijednosti validne,pozivamo metodu koja vraća
				// nasumičan broj
				if (isValid) {
					System.out.println("Random number is: " + getRandom(array));
				}
			} else {
				System.out.println("Enter size bigger than 0 and smaller than 54.");
			}

		} catch (Exception ex) {
			System.out.println("Error.Please enter integer between 1 and 54.");
		}
		input.close();
	}

	// Metoda koja vraća nasumičan broj od 0 do 54 izuzev brojeva koji su
	// proslijedjeni u argumentu
	public static int getRandom(int... numbers) {
		boolean isValid;
		int randomNumber = 0;

		while (true) {

			isValid = true;
			randomNumber = (int) (1 + Math.random() * 54);
			for (int i = 0; i < numbers.length; i++) {

				if (randomNumber == numbers[i])
					isValid = false;
			}

			if (isValid)
				break;

		}
		return randomNumber;
	}
}
