package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
	// (Largest rows and columns) Write a program that randomly fills in 0s and
	// 1s
	// into an n-by-n matrix, prints the matrix, and finds the rows and columns
	// with the
	// most 1s. (Hint: Use two ArrayLists to store the row and column indices
	// with
	// the most 1s.)

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		try {
			int n = input.nextInt();
			if (n > 2 && n < 25) {
				int[][] matrix = new int[n][n];
				System.out.println();
				fillMatrix(matrix);
				printMatrix(matrix);
				ArrayList<Integer> row = new ArrayList<>();
				ArrayList<Integer> column = new ArrayList<>();
				getRowWithMost1s(matrix, row);
				getColumnWithmost1s(matrix, column);

				System.out.println("\nRow with the most 1s: " + row);
				System.out.println("\nColumn with the most 1s: " + column);

			} else {
				System.out.println("Please value bigger than 2 and smaller than 25.");
			}

		} catch (Exception e) {
			System.out.println("Invalid input.Please enter number !");
		}
		input.close();

	}

	public static void fillMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}

		}
	}

	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d", matrix[i][j]);

			}
			System.out.println();

		}

	}

	public static void getRowWithMost1s(int[][] m, ArrayList<Integer> row) {

		int rowWithMost1s = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] == 1) {
					count++;
				}
			}
			if (rowWithMost1s < count) {
				rowWithMost1s = count;
				row.clear();
				row.add(i);
			} else if (rowWithMost1s == count) {
				row.add(i);
			}
		}

	}

	public static void getColumnWithmost1s(int[][] m, ArrayList<Integer> column) {

		int columnWithMost1s = 0;
		for (int j = 0; j < m[0].length; j++) {
			int count = 0;
			for (int i = 0; i < m.length; i++) {

				if (m[i][j] == 1) {
					count++;
				}
			}
			if (columnWithMost1s < count) {
				columnWithMost1s = count;
				column.clear();
				column.add(j);
			} else if (columnWithMost1s == count) {
				column.add(j);
			}
		}
	}

}
