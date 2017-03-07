package mini_4_battleship;

import java.util.Scanner;

public class App {

	// Igra funkcioniše tako što pogadjate gdje su brodovi i gadjate na to
	// mjesto unošenjem koordinata.Nakon svakog gadjanja igra vam daje hint
	// koliko još brodova ima u toj koloni i tom redu.Kada pogodite 3 broda igra
	// se završava.Poenta je pogoditi 3 broda u što manje pokušaja.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// napravimo matricu za tablu i brodove i niz koji sadrži koordinate
		int[][] table = new int[5][5];
		int[][] ships = new int[3][2];
		int[] shoot = new int[2];
		int attempts = 0, shotHit = 0;

		// metode za inicijalizaciju table i razmještanje brodova
		Battleship.setTable(table);
		Battleship.setShips(ships);

		System.out.println();
		// početak igre
		game(shoot, ships, table, input, attempts, shotHit);

	}

	public static void game(int[] shoot, int[][] ships, int[][] table, Scanner input, int attempts, int shotHit) {
		try {
			do {
				Battleship.showTable(table);
				shoot(shoot, input);
				// ako korisnik unese broj manji od 1 ili veći od 5 ispisujemo
				// mu poruku da to nije dozvoljeno,u protivnom gadjamo na to
				// mjesto
				if (shoot[0] > 0 && shoot[0] < 6 && shoot[1] > 0 && shoot[1] < 6) {
					attempts++;

					if (hit(shoot, ships)) {
						Battleship.hint(shoot, ships, attempts);
						shotHit++;
					} else
						Battleship.hint(shoot, ships, attempts);

					Battleship.changeboard(shoot, ships, table);
				} else {
					System.out.println("Invalid input.Please enter rows and columns between 1 and 5.");
					game(shoot, ships, table, input, attempts, shotHit);
					break;
				}
				// sa 3 pogotka završavamo igru
			} while (shotHit != 3);

			System.out.println("\nBattleship game finished! You hit 3 ships in " + attempts + " attempts");
			Battleship.showTable(table);

		} catch (Exception ex) {
			System.out.println("Invalid input.Please enter numbers.");

		}

	}

	// metoda koja uzima koordinate od korisnika
	public static void shoot(int[] shoot, Scanner input) {

		System.out.print("Row: ");
		shoot[0] = input.nextInt();
		shoot[0]--;

		System.out.print("Column: ");
		shoot[1] = input.nextInt();
		shoot[1]--;

	}

	// metoda koja provjerava da li se na unesenim koordinatama nalazi brod
	public static boolean hit(int[] shoot, int[][] ships) {
		// i je ship
		for (int i = 0; i < ships.length; i++) {
			if (shoot[0] == ships[i][0] && shoot[1] == ships[i][1]) {
				System.out.printf("You hit a ship located in (%d,%d)\n", shoot[0] + 1, shoot[1] + 1);
				return true;
			}
		}
		return false;
	}

}
