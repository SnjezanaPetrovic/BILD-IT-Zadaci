package bonus_13_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo broj svjetlosnih godina od korisnika
			System.out.println("Unesite broj svjetlosnih godina koje bi željeli da putovati: ");
			double lightYears = input.nextDouble();
			if (lightYears > 0) {
				calculateDistance(lightYears);

			} else {
				System.out.println("Unesite broj veći od 0.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static void calculateDistance(double lightYears) {
		DecimalFormat df = new DecimalFormat("##.###");
		// broj kilometara koje svjetlost pređe u datom vremenu
		double distanceInKm = lightYears * 9460730472580.00;
		// broj AU (astronomical units) koje svjetlost pređe u datom vremenu
		double astronomicalUnits = lightYears * 63241.1;
		// broj parseca koje svjetlost pređe u datom vremenu
		double parsec = lightYears * 0.306601;
		// izračunavamo koliko bi trebalo nama da pređemo istu udaljenost
		// najbržim
		// man made objectom ikada (Helios 2)
		double helios2 = distanceInKm / 252792.537;

		System.out.println("Dužina tog puta je " + distanceInKm + " kilometara.");
		System.out.println("U datom vremenu svjetlost predje " + astronomicalUnits + " AU.");
		System.out.println("U datom vremenu svjetlost predje " + parsec + " parseca.");
		System.out.println("Sa Helios2 bi nam trebalo " + df.format(helios2) + " sati.");

	}

}
