package zadaci_27_02_2017;


public class Zadatak3 {
	// (Largest row and column) Write a program that randomly fills in 0s and 1s
	// into
	// a 4-by-4 matrix, prints the matrix, and finds the first row and column
	// with the
	// most 1s. Here is a sample run of the program:
	// 0011
	// 0011
	// 1101
	// 1010
	// The largest row index: 2
	// The largest column index: 2

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];
		fillMatrix(matrix);
		printMatrix(matrix);

		System.out.println("The largest row index: " + largestRowIndex(matrix));
		System.out.println("The largest column index: " + largestColumnIndex(matrix));

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

	public static int largestRowIndex(int[][] matrix) {

		int sum = 0;
		int largestSum = 0;
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			if (sum > largestSum) {
				largestSum = sum;
				index = i;
			}
			sum = 0;

		}
		return index;
	}

	public static int largestColumnIndex(int[][] matrix) {

		int sum = 0;
		int largestSum = 0;
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];
			}
			if (sum > largestSum) {
				largestSum = sum;
				index = i;
			}
			sum = 0;

		}
		return index;
	}

}
