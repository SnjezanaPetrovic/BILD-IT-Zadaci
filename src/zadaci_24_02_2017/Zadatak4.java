package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati metodu sa sljedećim headerom: public static String format(int
	// number, int width) koja vraća string broja sa prefiksom od jedne ili više
	// nula. Veličina stringa je width argument. Na primjer, ukoliko pozovemo
	// metodu format(34, 4) metoda vraća 0034, ukoliko pozovemo format(34, 5)
	// metoda vraća 00034. Ukoliko je uneseni broj veći nego width argument,
	// metoda vraća samo string broja. Npr. ukoliko pozovemo format(34, 1)
	// metoda vraća 34.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo podatke od korisnika
			System.out.println("Unesite cijeli broj: ");
			int number = input.nextInt();
			System.out.println("Unesite dužinu stringa: ");
			int width = input.nextInt();
			// Ograničavamo brojeve na manje od 2 milijarde a dužinu stringa na
			// manje od 50
			if (number > 0 && number < 2000000000 && width > 0 && width < 50) {
				System.out.println(format(number, width));
			} else {
				System.out.println(
						"Molimo unesite cijeli broj veći od 0 i manji od 2000000000 i dužinu veću od 0 i manju od 50");
			}

		} catch (Exception ex) {
			System.out
					.println("Došlo je do greške.Molimo unesite cijeli broj manji od 2000000000 i dužinu manju od 50");
		}
		input.close();

	}

	// Metoda koja vraća string broja sa prefiksom od jedne ili više 0
	public static String format(int number, int width) {

		String num = number + "";
		// ako broj ima više cifara od dužine stringa ,ispisujemo samo broj
		if (num.length() > width) {
			return num;
			// u suprotnom izračunavamo razliku da bi znali koliko 0 treba
			// ispisati ispred broja
		} else {
			int zeroesCount = width - num.length();
			String zeroes = "";
			for (int i = 0; i < zeroesCount; i++) {
				zeroes = zeroes + "0";
			}
			return zeroes + num;
		}
	}

}
