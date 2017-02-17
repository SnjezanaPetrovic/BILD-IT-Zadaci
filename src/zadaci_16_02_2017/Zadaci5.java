package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadaci5 {
	// Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
	// Metoda treba da koristi sljedeći header: public static String
	// convertMillis(long millis). Metoda treba da vraća vrijeme kao string u
	// formatu sati:minute:sekunde. Na primjer convertMillis(100000) treba da
	// vrati 0:1:40.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {

			System.out.println("Unesite broj milisekundi: ");
			long millis = input.nextLong();
			if (millis < 0) {
				System.out.println("Broj milisekundi mora biti pozitivan broj ili 0.");
			} else {
				System.out.println(millis + " milisekundi je: " + convertMillis(millis));
			}
			
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	public static String convertMillis(long millis) {

		long seconds = millis / 1000;
		long minutes = seconds / 60;
		seconds %= 60;
		long hours = minutes / 60;
		minutes %= 60;
		return hours + ":" + minutes + ":" + seconds;

	}

}
