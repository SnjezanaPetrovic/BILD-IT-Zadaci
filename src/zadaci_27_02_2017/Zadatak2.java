package zadaci_27_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Algebra: multiply two matrices) Write a method to multiply two matrices.
	// The
	// header of the method is:
	// public static double[][] multiplyMatrix(double[][] a, double[][] b)
	// To multiply matrix a by matrix b , the number of columns in a must be the
	// same
	// as the number of rows in b , and the two matrices must have elements of
	// the
	// same or compatible types. Let c be the result of the multiplication.
	// Assume the
	// column size of matrix a is n . Each element c ij is
	// a i1 * b 1j + a i2 * b 2j + c + a in * b nj .
	// c ij = a i1 * b 1j + a i2 * b 2j + a i3 * b 3j .
	// Write a test program that prompts the user to enter two 3 * 3 matrices
	// and dis-
	// plays their product.
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
			// ako su matrice iste veličine pozivamo metodu koja će ih pomnožiti
			if (matrix1[0].length == matrix2.length) {
				printMatrixes(matrix1, matrix2, multiplyMatrix(matrix1, matrix2));
			} else {
				System.out.println("Size of the matrixes has to be the same.");
			}

		} catch (Exception ex) {
			ex.getMessage();
			System.out.println("Error.Please input numbers.");

		}
		input.close();

	}

	// metoda kojom množimo dvije matrice i vraća nam matricu sa rezultatima
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] result = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];

			}

		}
		return result;

	}

	// metoda za popunjavanje matrica
	public static void fillMatrix(double[][] matrix, Scanner input) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}

		}

	}

	// metoda koja ispisuje sve tri matrice
	public static void printMatrixes(double[][] matrix1, double[][] matrix2, double[][] result) {

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.printf("%7.2f", matrix1[i][j]);

				if (i == 1 && j == 2) {
					System.out.printf("  *");
				} else if (j == 2) {
					System.out.printf("   ");
				}
			}

			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.printf("%7.2f", matrix2[i][j]);

				if (i == 1 && j == 2) {
					System.out.print("  =");
				} else if (j == 2) {
					System.out.printf("   ");
				}
			}

			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%7.2f", result[i][j]);

			}
			System.out.println();

		}

	}

}
