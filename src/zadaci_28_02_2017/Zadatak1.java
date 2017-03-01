package zadaci_28_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	// (Row sorting) Implement the following method to sort the rows in a two-
	// dimensional array. A new array is returned and the original array is
	// intact.
	// public static double[][] sortRows(double[][] m)
	// Write a test program that prompts the user to enter a 3 * 3 matrix of
	// double
	// values and displays a new row-sorted matrix.

	public static void main(String[] args) {
		double[][] matrix = new double[3][3];
		try {
			// uzimamo vrijednosti matrice od korisnika
			System.out.println("Enter matrix 3*3: ");
			// popunjavamo i ispisujemo matricu
			fillMatrix(matrix);
			printMatrix(matrix);
			System.out.println("-------------------------");
			// pozivamo metodu koja sortira redove u matrici i ispisujemo tu
			// sortiranu matricu
			double[][] sortedM = sortRows(matrix);
			printMatrix(sortedM);
		} catch (Exception ex) {
			System.out.println("Invalid input.Please input numbers.");
		}

	}

	// metoda koja sortira matricu ali prvo pravi novu matricu koja je kopija
	// proslijedjene matrice i onda tu kopiju sortira
	public static double[][] sortRows(double[][] m) {
		double[][] result = copy(m);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < result[j].length; k++) {
					if (result[i][j] < result[i][k]) {
						double temp = result[i][j];
						result[i][j] = result[i][k];
						result[i][k] = temp;
					}
				}
			}
		}
		return result;
	}

	// metoda koja kopira matricu tako da možemo sortirati tu novu a da stara
	// ostane netaknuta
	public static double[][] copy(double[][] matrix) {
		double[][] copy = new double[matrix.length][matrix[0].length];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy[i].length; j++) {
				copy[i][j] = matrix[i][j];
			}
		}
		return copy;
	}

	// metoda za popunjavanje matrice
	public static void fillMatrix(double[][] matrix) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		input.close();

	}

	// metoda za printanje matrice
	public static void printMatrix(double[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%6.2f", matrix[i][j]);

			}
			System.out.println();
		}
	}

}
