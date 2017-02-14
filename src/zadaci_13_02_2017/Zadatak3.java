package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// Napisati program koji pita korisnika da unese 2 stringa te ispisuje
	// najveći zajednički prefix za ta dva stringa, ukoliko isti postoji. Na
	// primjer, ukoliko korisnik unese sljedeća dva stringa "Dobrodošli u Dubai"
	// i "Dobrodošli u Vankuver" program treba da ispiše: Najveći zajednički
	// prefix za dva stringa je "Dobrodošli u".

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite prvi string: ");
			String s1 = input.nextLine().toLowerCase();
			System.out.println("Unesite drugi string: ");
			String s2 = input.nextLine().toLowerCase();
			System.out.print("Zajednički prefix je: ");
			printPrefix(s1, s2);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	/**
	 * 
	 * @param s1
	 *            prvi string
	 * @param s2
	 *            drugi string
	 */
	public static void printPrefix(String s1, String s2) {

		int[] array = { s1.length(), s2.length() };
		java.util.Arrays.sort(array);

		if (s1.charAt(0) != s2.charAt(0)) {
			System.out.println("Ne postoji zajednički prefix.");

		} else {
			for (int i = 0; i < array[0]; i++) {

				if (s1.charAt(i) == s2.charAt(i)) {
					System.out.print(s1.charAt(i));
				}

			}

		}

	}

}
