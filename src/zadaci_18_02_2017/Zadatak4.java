package zadaci_18_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati program koji pita korisnika da unese broj minuta
	// (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama i danima.
	// Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo broj minuta od korisnika i ako je taj broj veći od 0
			// pozivamo metodu koja pretvara minute u godine,dane,sate i minute
			System.out.println("Unesite broj minuta: ");
			long minutes = input.nextLong();
			if (minutes > 0) {
				System.out.print(minutes);
				convertMinutes(minutes);
			} else {
				System.out.println("Broj minuta mora biti veći od 0.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Morate unijeti broj veći od 0.");
		}
		input.close();

	}

	// metodu koja pretvara minute u godine,dane,sate i minute
	public static void convertMinutes(long minutes) {

		long hours = minutes / 60;
		minutes %= 60;
		long days = hours / 24;
		hours %= 24;
		long years = days / 365;
		days %= 365;

		System.out.print(
				" minuta je " + years + " godina, " + days + " dana, " + hours + " sati i " + minutes + " minuta");
	}

}
