package zadaci_22_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati metodu koja ispisuje n x n matricu koristeći se sljedećim
	// headerom: public static void printMatrix(int n). Svaki element u matrici
	// je ili 0 ili 1, nasumično generisana. Napisati test program koji pita
	// korisnika da unese broj n te mu ispiše n x n matricu u konzoli.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo vrijednost n od korisnika
			System.out.println("Unesite vrijednost n veću od 1: ");
			int n = input.nextInt();
			// Pošto matrica 1*1 nema smisla stavljamo da je veća od 1
			if (n > 1) {
				printMatrix(n);
			} else {
				System.out.println("n mora biti veće od 1.");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite cijeli broj.");
		}
		input.close();

	}

	// Metoda koja popunjava matricu sa random 0 ili 1 i ispisuje je
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);

			}

		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();

		}

	}

}
