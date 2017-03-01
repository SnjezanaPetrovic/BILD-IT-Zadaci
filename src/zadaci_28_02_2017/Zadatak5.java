package zadaci_28_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// (The Location class) Design a class named Location for locating a maximal
	// value and its location in a two-dimensional array. The class contains
	// public data
	// fields row , column , and maxValue that store the maximal value and its
	// indices
	// in a two-dimensional array with row and column as int types and maxValue
	// as
	// a double type.
	// Write the following method that returns the location of the largest
	// element in a
	// two-dimensional array:
	// public static Location locateLargest(double[][] a)
	// The return value is an instance of Location . Write a test program that
	// prompts
	// the user to enter a two-dimensional array and displays the location of
	// the largest
	// element in the array.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// uzimamo broj kolona i redova od korisnika
			System.out.println("Enter the number of rows and columns in te array: ");
			int row = input.nextInt();
			int column = input.nextInt();
			input.close();

			double[][] matrix = new double[row][column];
			// generišemo i ispisujemo matricu
			generateArray(matrix);
			printArray(matrix);
			Location location = Location.locateLargest(matrix);
			System.out.println("The location of the largest element is " + location.maxValue + " at " + "("
					+ location.row + "," + location.column + ")");
		} catch (Exception ex) {
			System.out.println("Error.Please enter positive integers.");
		}

	}

	// metoda koja generiše nasumične double vrijednosti i smješta ih u matricu
	public static void generateArray(double[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (Math.random() * 10);

			}

		}

	}

	// metoda koja ispisuje matricu
	public static void printArray(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%6.2f", matrix[row][column]);

			}
			System.out.println();

		}

	}

}
