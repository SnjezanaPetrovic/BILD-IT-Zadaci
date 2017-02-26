package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// (Sum elements column by column) Write a method that returns the sum of
	// all the
	// elements in a specified column in a matrix using the following header:
	// public static double sumColumn(double[][] m, int columnIndex)
	// Write a test program that reads a 3-by-4 matrix and displays the sum of
	// each
	// column.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			// uzimamo vrijednosti id korisnika i smještamo ih u matricu
			System.out.println("Enter a 3-by-4 matrix row by row: ");
			double[][] matrix = new double[3][4];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = input.nextDouble();
				}

			}
			// za svaku kolonu pozivamo metodu koja će tu kolonu sabrati i
			// ispisati rezultat
			for (int column = 0; column < 4; column++) {
				System.out.println("Sum of the elements at column " + column + " is " + sumColumn(matrix, column));
			}

		} catch (Exception ex) {
			System.out.println("Error.Please input integeres.");
		}
		input.close();

	}

	// Metoda koja sabira kolone u matrici
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}

		return sum;

	}

}
