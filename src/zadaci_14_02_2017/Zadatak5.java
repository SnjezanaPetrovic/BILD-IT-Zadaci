package zadaci_14_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak5 {
	// Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, možemo
	// izračunati minimalnu dužinu piste potrebne da avion uzleti koristeći se
	// sljedećom formulom: dužina = v * v / 2a. Napisati program koji pita
	// korisnika da unese v u m/s i a u m/s² te ispisuje korisniku minimalnu
	// dužinu piste. (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje
	// dužina piste je 514.286)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####.###");

		try {
			System.out.println("Unesite brzinu kojom avion uzlijeće u m/s: ");
			double v = input.nextDouble();
			System.out.println("Unesite ubrzanje aviona u m/s²: ");
			double a = input.nextDouble();
			if (v > 0 && a > 0) {
				System.out.println("Minimalna dužina piste potrebna za avion koji polijeće brzinom od " + v
						+ " m/s i ima ubrzanje od " + a + " m/s² je " + df.format(calculateAirstrip(v, a)));

			} else {
				System.out.println("Vrijednosti moraju biti veće od 0.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	/**
	 * 
	 * @param v
	 *            -brzina kojom avion uzlijece
	 * @param a
	 *            - ubrzanje aviona
	 * @return airstrip -duzina piste
	 **/
	public static double calculateAirstrip(double v, double a) {

		double airstrip = v * v / (2 * a);

		return airstrip;

	}

}
