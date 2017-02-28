package mini_3_TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[][] table = new char[3][3];

		displayPositions(table);

		char sign = 0;
		try {

			while (true) {
				sign = enterSign(sign, input);
				int[] position = new int[2];
				while (true) {
					setPosition(position, input);
					if (position[0] >= 0 && position[0] < 3 && position[1] >= 0 && position[1] < 3) {

						setSignToPosition(sign, position, table);

						if (isGameOn(sign, table)) {
							sign = enterSign(sign, input);
							displayTable(table);

						} else if (!isGameOn(sign, table)) {
							displayTable(table);
							System.out.println(sign + " won.");
							System.exit(0);

						}
					} else {
						System.out.println("Invalid input.Please choose between 0,1 or 2.");
					}

				}

			}
		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	// metoda vraća false ako je igra gotova
	public static boolean isGameOn(char sign, char[][] table) {
		if (sign == 'X' || sign == 'O') {
			// provjeravamo redove da vidimo postoje li 3 uzastopna znaka
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table.length; j++) {
					if ((table[i][0] == 'X' || table[i][0] == 'O') && table[i][0] == table[i][1]
							&& table[i][0] == table[i][2]) {
						return false;
					}
				}

			}
			// //provjeravamo kolone da vidimo postoje li 3 uzastopna znaka
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					if ((table[0][j] == 'X' || table[0][j] == 'O') && table[0][j] == table[1][j]
							&& table[0][j] == table[2][j]) {
						return false;
					}

				}

			}
			// //provjeravamo glavnu dijagonalu da vidimo postoje li 3 uzastopna
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					if ((table[0][0] == 'X' || table[0][0] == 'O') && table[0][0] == table[1][1]
							&& table[0][0] == table[2][2]) {
						return false;
					}

				}

			}
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					if ((table[0][2] == 'X' || table[0][2] == 'O') && table[0][2] == table[1][1]
							&& table[0][2] == table[2][0]) {
						return false;
					}

				}

			}
		}

		return true;

	}

	public static void setSignToPosition(char sign, int[] position, char[][] table) {

		int positionX = position[0];
		int positionY = position[1];
		if (table[positionX][positionY] == 0) {
			table[positionX][positionY] = sign;
		} else {
			System.out.println("Position taken.");
			// return false;
		}

		// return true;
	}

	public static void setPosition(int[] position, Scanner input) {

		System.out.println("Enter position: ");

		System.out.print("Enter x: ");
		position[0] = input.nextInt();
		System.out.print("Enter y: ");
		position[1] = input.nextInt();
		System.out.println();

	}

	public static void displayPositions(char[][] table) {

		System.out.println("Please choose the position in the table (x,y): ");

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.printf("[%1d %1d]", i, j);

			}
			System.out.println();

		}

	}

	public static void displayTable(char[][] table) {

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.printf("[ %1s ]", table[i][j]);
			}
			System.out.println();

		}
	}

	public static char enterSign(char sign, Scanner input) {

		if (sign == 'X') {
			System.out.println("O player is next: ");
			sign = 'O';
		} else if (sign == 'O') {
			System.out.println("X player is next: ");
			sign = 'X';
		} else {
			while (sign != 'X' && sign != 'O') {
				System.out.print("Please enter X or O: ");
				sign = input.next().charAt(0);
				sign = Character.toUpperCase(sign);
			}
		}
		return sign;

	}

}
