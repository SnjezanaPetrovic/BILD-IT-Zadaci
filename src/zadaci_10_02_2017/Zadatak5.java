package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Implementirati sljedeću metodu da sortira redove u 2D nizu.
	//
	// public static double[ ][ ] sortRows(double[ ][ ] array)
	//
	// Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da
	// pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli
	// matricu sa sortiranim redovima - od najmanjeg broja do najvećeg.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Uzimamo od korisnika broj redova i kolona
		System.out.println("Unesite broj redova i kolona u 2D nizu: ");
		int row = input.nextInt();
		int column = input.nextInt();

		// Napravimo 2D niz i uzmemo vrijednosti elemenata od korisnika
		double[][] matrix = new double[row][column];
		System.out.println("Unesite vrijednosti u 2D niz: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();

			}

		}
		input.close();
		// Pozivamo metodu koja sortira redove a zatim i metodu koja ispisuje
		// matricu u konzoli
		try {
			double[][] sortedMatrix = sortRows(matrix);
			System.out.println("********************************");
			printMatrix(sortedMatrix);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	// Metoda koja sortira redove i vraća sortiranu matricu
	public static double[][] sortRows(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				java.util.Arrays.sort(array[j]);
			}
		}
		return array;

	}

	// Metoda koja ispisuje matricu u konzoli
	public static void printMatrix(double[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%6.2f", matrix[i][j]);

			}
			System.out.println();

		}

	}

}
