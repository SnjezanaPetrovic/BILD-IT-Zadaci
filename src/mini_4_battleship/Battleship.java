package mini_4_battleship;

import java.util.Random;

public class Battleship {
	// metoda koja inicijalizuje tablu
	public static void setTable(int[][] table) {
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++)
				table[i][j] = -1;
	}

	// metoda koja ispisuje tablu sa trenutnim stanjem
	public static void showTable(int[][] table) {
		System.out.println("\t1 \t2 \t3 \t4 \t5");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "");
			for (int j = 0; j < 5; j++) {
				if (table[i][j] == -1) {
					System.out.print("\t" + "~");
				} else if (table[i][j] == 0) {
					System.out.print("\t" + "*");
				} else if (table[i][j] == 1) {
					System.out.print("\t" + "X");
				}

			}
			System.out.println();
		}

	}

	// metoda koja postavlja brodove na random koordinate
	public static void setShips(int[][] ships) {
		Random random = new Random();

		for (int i = 0; i < 3; i++) {
			ships[i][0] = random.nextInt(5);
			ships[i][1] = random.nextInt(5);

			for (int j = 0; j < i; j++) {
				if ((ships[i][0] == ships[j][0]) && (ships[i][1] == ships[j][1]))
					do {
						ships[i][0] = random.nextInt(5);
						ships[i][1] = random.nextInt(5);
					} while ((ships[i][0] == ships[j][0]) && (ships[i][1] == ships[j][1]));
			}

		}
	}

	// metoda koja daje hint koliko još brodova ima u redu i koloni
	public static void hint(int[] shoot, int[][] ships, int attempt) {
		int row = 0, column = 0;

		for (int line = 0; line < ships.length; line++) {
			if (ships[line][0] == shoot[0])
				row++;
			if (ships[line][1] == shoot[1])
				column++;
		}

		System.out.printf("\nHint %d: \nRow %d -> %d ships\n" + "Column %d -> %d ships\n", attempt, shoot[0] + 1, row,
				shoot[1] + 1, column);
	}

	// metoda koja mijenja stanje na tabli
	public static void changeboard(int[] shoot, int[][] ships, int[][] table) {
		if (App.hit(shoot, ships))
			table[shoot[0]][shoot[1]] = 1;
		else
			table[shoot[0]][shoot[1]] = 0;
	}

}
