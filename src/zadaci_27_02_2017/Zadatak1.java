package zadaci_27_02_2017;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {
	// (Compute the weekly hours for each employee) Suppose the weekly hours for
	// all
	// employees are stored in a two-dimensional array. Each row records an
	// employ-
	// ee’s seven-day work hours with seven columns. For example, the following
	// array stores the work hours for eight employees. Write a program that
	// displays
	// employees and their total hours in decreasing order of the total hours.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matrix = new int[8][7];
		try {
			// meni u kojem korisnik bira da li želi unijeti sam sate ili da
			// budu nasumično generisani
			System.out.println("Do you want to\n1.generate hours randomly\n2.enter hours manually");
			int choice = input.nextInt();
			if (choice == 1) {
				generateMatrix(matrix);
				sortEmployees(matrix);
			} else if (choice == 2) {
				fillMatrix(matrix, input);
				sortEmployees(matrix);
			} else {
				System.out.println("There's been a mistake.Please choose 1 or 2.");
			}

		} catch (Exception ex) {
			System.out.println("Error.Please enter whole numbers..");
		}

	}

	// metoda kojom popunjavamo matricu unoseći vrijednosti
	public static void fillMatrix(int[][] matrix, Scanner input) {
		System.out.println("Enter the values:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}

		}
	}

	// metoda koja popunjava matricu generišući brojeve
	public static void generateMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (1 + Math.random() * 9);
			}

		}
	}

	// metoda koja ispisuje zaposlenike i njihove sate
	public static void printEmployees(String[] employee) {

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}
	}

	public static void sortEmployees(int[][] matrix) {
		// svaki red u matrici posmatramo kao jednu cjelinu (employee)i
		// stavljamo te cjeline u ArrayList
		String[] employee = new String[matrix.length];
		Arrays.fill(employee, "");

		System.out.println("\t     Su   M    T    W   Th    F   Sa");
		// sabiramo sate za svakog zaposlenog
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			System.out.print("Employee " + i + "   ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "    ");
				sum += matrix[i][j];

			}
			System.out.println();
			employee[i] = sum + " hours -employee " + i;
		}
		// sortiramo ArrayList i ispisujemo zaposlenike
		Arrays.sort(employee, Collections.reverseOrder());
		printEmployees(employee);

	}

}
