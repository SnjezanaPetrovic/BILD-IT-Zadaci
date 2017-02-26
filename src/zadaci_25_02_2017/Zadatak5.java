package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// (Algebra: add two matrices) Write a method to add two matrices. The
	// header of
	// the method is as follows:
	// public static double[][] addMatrix(double[][] a, double[][] b)
	// In order to be added, the two matrices must have the same dimensions and
	// the
	// same or compatible types of elements. Let c be the resulting matrix. Each
	// ele-
	// ment c ij is a ij + b ij
	// Write a test program that prompts the user to enter two 3 * 3 matrices
	// and
	// displays their sum.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// uzimamo vrijednosti od korisnika i unosimo ih u prvu a zatim i
			// drugu matricu
			System.out.println("Enter first 3-by-3 matrix: ");
			double[][] matrix1 = new double[3][3];
			fillMatrix(matrix1, input);

			System.out.println("Enter second 3-by-3 matrix: ");
			double[][] matrix2 = new double[3][3];
			fillMatrix(matrix2, input);
			// ako su matrice iste veličine pozivamo metodu koja će ih sabrati
			if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
				printMatrixes(matrix1, matrix2, addMatrix(matrix1, matrix2));
			} else {
				System.out.println("Size of the matrixes has to be the same.");
			}

		} catch (Exception ex) {
			System.out.println("Error.Please input numbers.");
			ex.getMessage();
		}
		input.close();

	}

	// metoda koja sabira matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {

		double[][] sumMatrix = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sumMatrix[i][j] = a[i][j] + b[i][j];

			}

		}
		return sumMatrix;

	}

	// metoda koja ispisuje sve tri matrice
	public static void printMatrixes(double[][] matrix1, double[][] matrix2, double[][] matrixSum) {

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.printf("%7.2f", matrix1[i][j]);

				if (i == 1 && j == 2) {
					System.out.printf(" +");
				} else if (j == 2) {
					System.out.printf("  ");
				}
			}

			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.printf("%7.2f", matrix2[i][j]);

				if (i == 1 && j == 2) {
					System.out.print(" =");
				} else if (j == 2) {
					System.out.printf("  ");
				}
			}

			for (int j = 0; j < matrixSum[i].length; j++) {
				System.out.printf("%7.2f", matrixSum[i][j]);

			}
			System.out.println();

		}

	}

	// metoda za popunjavanje matrica
	public static void fillMatrix(double[][] matrix, Scanner input) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}

		}

	}

}
