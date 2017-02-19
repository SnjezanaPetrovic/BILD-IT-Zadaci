package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
	// Napisati program koji pita korisnika da unese imena tri grada te ih
	// ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los
	// Angeles i Atlanta kao gradove, program vraća Atlanta, Chicago, Los
	// Angeles.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo imena gradova od korisnika
			System.out.println("Unesite prvi grad: ");
			String firstCity = input.nextLine();
			System.out.println("Unesite drugi grad: ");
			String secondCity = input.nextLine();
			System.out.println("Unesite treći grad: ");
			String thirdCity = input.nextLine();
			// Ako je unos validan ubacujemo gradove u listu
			if (isValidCity(firstCity) && isValidCity(secondCity) && isValidCity(thirdCity)) {

				ArrayList<String> cities = new ArrayList<>();

				cities.add(firstCity);
				cities.add(secondCity);
				cities.add(thirdCity);
				// sortiramo listu
				cities.sort(String::compareTo);

				// Ispisujemo rezultat
				System.out.println("Gradovi poredani abecednim redom: ");
				for (String city : cities) {
					System.out.println(city + " ");
				}
			} else {
				System.out.println("Unos nije dobar.Imena gradova mogu sadržavati samo slova, space ili '-' .");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static boolean isValidCity(String city) {

		String cityShortened = city.replaceAll(" ", "");
		String cityShort = cityShortened.replaceAll("-", "");

		for (int i = 0; i < cityShort.length(); i++) {
			char ch = cityShort.charAt(i);
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}

}
