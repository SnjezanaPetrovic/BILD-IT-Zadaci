package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadaci2 {
	// Great circle distance predstavlja udaljenost između dvije tačke na
	// površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
	// širinu i dužinu dvije tačke. Great circle distance između ove dvije tačke
	// može biti izračunata koristeći se sljedećom formulom: d = radius * arccos
	// (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program
	// koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije
	// tačke na površini zemlje te mu ispisuje great circle distance. Prosječni
	// radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo
	// promijeniti u radianse koristeći se Math.toRadians metodom jer Java
	// trigonometrijske metode koriste radianse. Širina i dužina u ovoj formuli
	// se odnose na zapad i sjever. Koristimo negativne vrijednosti da označimo
	// istok i jug.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite geografsku širinu u stepenima za tačku 1: ");
			double x1 = input.nextDouble();
			System.out.println("Unesite geografsku dužinu u stepenima za tačku 1: ");
			double y1 = input.nextDouble();

			System.out.println("Unesite geografsku širinu u stepenima za tačku 2: ");
			double x2 = input.nextDouble();
			System.out.println("Unesite geografsku dužinu u stepenima za tačku 2: ");
			double y2 = input.nextDouble();
			if (x1 >= -90 && x1 <= 90 && x2 >= -90 && x2 <= 90 && y1 >= -180 && y1 <= 180 && y2 >= -180 && y2 <= 180) {
				System.out.println("Great circle distance izmedju te dvije tačke je "
						+ greatCircleDistance(x1, y1, x2, y2) + " km.");
			} else {
				System.out.println(
						"Geografske širine moraju biti u rasponu od -90 do 90, a geografske dužine od -180 do 180.");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Pogrešan unos.");
		}
		input.close();

	}

	public static double greatCircleDistance(double x1, double y1, double x2, double y2) {
		// d = radius * arccos
		// (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

		double d = 6371.01
				* Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))
						* Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
		return d;
	}

}
