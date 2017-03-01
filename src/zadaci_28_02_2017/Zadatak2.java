package zadaci_28_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// (Strictly identical arrays) The two-dimensional arrays m1 and m2 are
	// strictly
	// identical if their corresponding elements are equal. Write a method that
	// returns
	// true if m1 and m2 are strictly identical, using the following header:
	// public static boolean equals(int[][] m1, int[][] m2)
	// Write a test program that prompts the user to enter two 3 * 3 arrays of
	// integers and displays whether the two are strictly identical.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];

		try {
			// uzimamo unos od korisnika
			System.out.println("Enter matrix 1 (3x3): ");
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					matrix1[i][j] = input.nextInt();
				}
			}
			System.out.println("Enter matrix 2 (3x3): ");
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					matrix2[i][j] = input.nextInt();
				}
			}
			// ispisujemo matrice
			System.out.println("Matrix1 - ");
			printMatrix(matrix1);
			System.out.println("Matrix2 -  ");
			printMatrix(matrix2);
			input.close();
			// pozivamo metodu koja provjerava da li su matrice striktno
			// identične
			if (equals(matrix1, matrix2)) {
				System.out.println("They are strictly identical.");
			} else {
				System.out.print("They are not strictly identical.");
			}
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}

	}

	// metoda za printanje matrice
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%3d", matrix[row][column]);

			}
			System.out.println();

		}

	}

	// metoda koja provjerava jesu li striktno identične
	public static boolean equals(int[][] m1, int[][] m2) {

		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
