package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu. Metoda
	// treba da koristi sljedeći header:
	//
	// public static int[ ] locateLargest(double[ ][ ] a)
	//
	// Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje
	// lokaciju najvećeg elementa u nizu.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
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
			// Pozivamo metodu koja pronalazi lokaciju najvećeg elementa u nizu
			// i ispisujemo je korisniku

			int[] largestEl = locateLargest(matrix);
			System.out.println("Lokacija najvećeg elementa u nizu je: " + largestEl[0] + "," + largestEl[1]);
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

	}

	// Metoda koja pronalazi najveći element u 2D nizu i vraća njegovu lokaciju
	// u obliku jednodimenzionalnog niza
	public static int[] locateLargest(double[][] a) {

		int[] indexes = new int[2];

		double largest = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
					indexes[0] = i;
					indexes[1] = j;
				}

			}

		}
		return indexes;

	}

}
