package bonus_13_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			//Uzimamo broj godina od korisnika
			System.out.println("Unesite broj godina koliko želite da putujete u prošlost: ");
			long year = input.nextLong();
			if (year > 0) {
				timePassed(year);
				System.out.println("Ili");
				stepsMade(year);
			} else {
				System.out.println("Unesite broj veći od 0.");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	// Izračunavamo milenijume,vijekove,dekade,godine,mjesece,dane,minute i
	// sekunde
	public static void timePassed(long year) {

		long seconds = year;
		long realSeconds = seconds % 60;
		long minutes = seconds / 60;
		long realMinutes = minutes % 60;
		long hours = minutes / 60;
		long realHours = hours % 24;
		long days = hours / 24;
		long realDays = hours % 24;
		long months = days / 30;
		long realMonths = months % 12;
		long totalYears = days / 365;
		long realYears = totalYears % 10;
		long decade = totalYears / 10;
		long realDecade = decade % 10;
		long century = decade / 10;
		long realCentury = century % 10;
		long milenium = century / 10;

		System.out.println("Trebali bi putovati " + milenium + " mileniuma " + realCentury + " vijekova " + realDecade
				+ " dekada " + realYears + " godina " + realMonths + " mjeseci " + realDays + " dana " + realHours
				+ " sati " + realMinutes + " minuta i " + realSeconds + " sekundi");
	}

	// Izračunavamo koliko kilometara,metara i centimetara treba da predjemo ako
	// je jedna godina jednaka jednom koraku(75cm)
	public static void stepsMade(long year) {

		long centimeters = year * 75;
		long realCentimeters = centimeters % 100;
		long meters = centimeters / 100;
		long realMeters = meters % 1000;
		long realKilometers = meters / 1000;
		// Izračunavamo koliko puta bi mogli obići stadion ili zemaljsku kuglu
		double stadion = meters / 105;
		double earthPerimeter = realKilometers / 40075;

		// Ispisujemo rezultate
		System.out.println("Trebali bi koračati " + realKilometers + " kilometara " + realMeters + " metara i "
				+ realCentimeters + " centimetara");
		System.out.println(stadion + " puta bi prehodali prosječni fudbalski stadion.");
		System.out.println(earthPerimeter + " puta bi prehodali obim zemlje");

	}
}
