package mini_3_ConnectFour;

import java.util.Scanner;

public class ConnectFour {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[][] table = new char[6][7];

		boolean gameOver = false;
		boolean player = true;
		int column = 0;
		char color;
		try {

			while (!gameOver) {

				if (player) {
					System.out.print("\nEnter R into column (0-6): ");
					color = 'R';
					player = !player;
				} else {
					System.out.print("\nEnter Y into column (0-6): ");
					color = 'Y';
					player = !player;
				}

				column = input.nextInt();

				while (column < 0 || column > 6) {
					System.out.print("Invalid input.Choose from 0 to 6:  ");
					column = input.nextInt();
					player = !player;
				}
				if (setPosition(table, column, color)) {
					player = !player;
				} else {
					printTable(table);
					if (gameStatus(table, column, color)) {
						gameOver = true;
						System.out.print("\n" + color + " won.");
					}

				}

			}

		} catch (Exception ex) {
			ex.getMessage();
		}
		input.close();

	}

	// Metoda koja provjerava da li je neko pobjedio ili se igra nastavlja
	public static boolean gameStatus(char[][] table, int column, char color) {

		int row = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i][column] != 0) {
				row = i;
				break;
			}
		}
		if (checkVertical(table, column, color, row)) {
			return true;
		}
		if (checkHorizontal(table, column, color, row)) {
			return true;
		}
		if (checkLeftDiagonal(table, column, color, row)) {
			return true;
		}
		if (checkRightDiagonal(table, column, color, row)) {
			return true;
		}

		return false;
	}

	// Metoda koja dodaje znak u tabelu
	public static boolean setPosition(char[][] table, int column, char color) {

		for (int i = table.length - 1; i >= 0; i--) {
			if (table[i][column] == 0) {
				table[i][column] = color;
				return false;
			}
		}

		return true;
	}

	// Metoda koja ispisuje tabelu
	public static void printTable(char[][] table) {

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print("|" + table[i][j]);
			}
			System.out.println("|");

		}
		System.out.println("---------------");

	}

	/**
	 * Metoda koja provjerava kolone
	 * 
	 * @param table
	 * @param column
	 * @param color
	 * @param row
	 * @return
	 */
	public static boolean checkVertical(char[][] table, int column, char color, int row) {

		int counter = 1;
		if ((row + 4) <= 6) {
			for (int i = row + 1; i <= (row + 3); i++) {
				if (color == table[i][column]) {
					counter++;
				} else {
					break;
				}
			}
		}
		if (counter == 4) {
			return true;
		}
		return false;
	}

	/**
	 * Metoda koja provjerava redove
	 * 
	 * @param table
	 * @param column
	 * @param color
	 * @param row
	 * @return
	 */
	public static boolean checkHorizontal(char[][] table, int column, char color, int row) {

		int counter = 1;
		for (int i = column - 1; i >= 0; i--) {
			if (color == table[row][i]) {
				counter++;
			} else {
				break;
			}
		}
		if (counter >= 4) {
			return true;
		}
		for (int i = column + 1; i < table[0].length; i++) {
			if (color == table[row][i]) {
				counter++;
			} else {
				break;
			}
		}
		if (counter >= 4) {
			return true;
		}
		return false;
	}

	/**
	 * Metoda koja provjerava glavnu dijagonalu
	 * 
	 * @param table
	 * @param column
	 * @param color
	 * @param row
	 * @return
	 */

	public static boolean checkLeftDiagonal(char[][] table, int column, char color, int row) {

		int counter = 1;

		for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
			if (color == table[i][j]) {
				counter++;
			} else {
				break;
			}
		}
		if (counter >= 4) {
			return true;
		}
		for (int i = row + 1, j = column + 1; i < table.length && j < table[0].length; i++, j++) {
			if (color == table[i][j]) {
				counter++;
			} else {
				break;
			}
		}
		if (counter >= 4) {
			return true;
		}
		return false;

	}

	/**
	 * Metoda koja provjerava sporednu dijagonalu
	 * 
	 * @param table
	 * @param column
	 * @param color
	 * @param row
	 * @return
	 */
	public static boolean checkRightDiagonal(char[][] table, int column, char color, int row) {

		int counter = 1;

		for (int i = row + 1, j = column - 1; i < table.length && j >= 0; i++, j--) {
			if (color == table[i][j]) {
				counter++;
			} else {
				break;
			}
		}
		if (counter >= 4) {
			return true;
		}
		for (int i = row - 1, j = column + 1; i >= 0 && j < table[0].length; i--, j++) {
			if (color == table[i][j]) {
				counter++;
			} else {
				break;
			}
		}
		if (counter >= 4) {
			return true;
		}
		return false;
	}
}
