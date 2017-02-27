package zadaci_27_02_2017;

public class Zadatak4 {
	// (Sort two-dimensional array) Write a method to sort a two-dimensional
	// array
	// using the following header:
	// public static void sort(int m[][])
	// The method performs a primary sort on rows and a secondary sort on
	// columns.
	// For example, the following array
	// {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
	// will be sorted to
	// {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.

	public static void main(String[] args) {

		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		sortElements(matrix);
		printMatrix(matrix);

	}

	// Metoda koja sortira matricu
	public static void sortElements(int matrix[][]) {

		for (int i = 0; i < matrix.length - 1; i++) {
			int minIndex = i;
			int[] minValue = matrix[i];
			for (int j = i + 1; j < matrix.length; j++) {
				if (minValue[0] > matrix[j][0] || minValue[0] == matrix[j][0] && minValue[1] > matrix[j][1]) {
					minValue = matrix[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				matrix[minIndex] = matrix[i];
				matrix[i] = minValue;
			}
		}

	}

	// Metoda koja ispisuje matricu
	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}

}
