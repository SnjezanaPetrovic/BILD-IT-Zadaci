package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati metodu koja ispisuje n x n matricu korsiteći sljedeći header:
	// public static void printMatrix(int n)
	// Svaki element u matrici je ili 0 ili 1, generisan nasumično. Napisati
	// test
	// program koji pita korisnika da unese n te ispisuje n x n matricu.

	public static void main(String[] args) {
		// Uzimamo vrijednost n od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj koji će predstavljati dužinu matrice: ");
		int n = input.nextInt();

		// Pozivamo metodu za generisanje i ispisivanje matrice

		try {
			printMatrix(n);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Unos mora biti cijeli broj.");

		}
		input.close();

	}

	public static void printMatrix(int n) {

		// Napravimo matricu i u nju ubacimo nasumične vrijednosti 0 ili 1
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);

			}

		}
		// Ispišemo matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();

		}

	}

}
