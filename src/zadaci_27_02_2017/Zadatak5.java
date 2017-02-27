package zadaci_27_02_2017;

public class Zadatak5 {
	// (Even number of 1s) Write a program that generates a 6-by-6
	// two-dimensional
	// matrix filled with 0s and 1s, displays the matrix, and checks if every
	// row and
	// every column have an even number of 1s

	public static void main(String[] args) {

		int[][] matrix = new int[6][6];
		fillMatrix(matrix);
		printMatrix(matrix);
		isEven1s(matrix);

	}

	// metoda koja popunjava matricu nasumičnim brojevima 0 i 1
	public static void fillMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}

		}
	}

	// metoda koja ispisuje matricu
	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d", matrix[i][j]);

			}
			System.out.println();

		}

	}

	public static void isEven1s(int[][] matrix) {
		int count = 0;
		// provjeravamo redove i brojimo koliko jedinica ima u svakom
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					count++;
				}
			}
			// ako je broj paran ispisujemo da jeste ako je neparan ispisujemo
			// da nije paran

			if (count % 2 == 0) {
				System.out.println("Row " + i + " has even number of 1s.");
			} else {
				System.out.println("Row " + i + " does not have even number of 1s.");
			}
			count = 0;

		}
		// provjeravamo kolone i brojimo koliko jedinica ima u svakoj
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == 1) {
					count++;
				}
			}
			// ako je broj paran ispisujemo da jeste ako je neparan ispisujemo
			// da nije paran
			if (count % 2 == 0) {
				System.out.println("Column " + i + " has even number of 1s.");
			} else {
				System.out.println("Column " + i + " does not have even number of 1s.");
			}
			count = 0;

		}

	}

}
