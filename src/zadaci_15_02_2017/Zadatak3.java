package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// Napisati program koji pita korisnika da unese godinu i prva tri slova
	// imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom
	// mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec
	// Jan program mu ispisuje da Jan 2011 ima 31 dan.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite godinu: ");
			int year = input.nextInt();
			System.out.println("Unesite prva tri slova mjeseca: ");
			String month = input.next();
			input.nextLine();
			int days = days(year, month);
			if (days == 0) {
				System.out.println("Niste dobro unijeli mjesec.");
			} else {
				System.out.println("mjesec " + month + " godine " + year + " ima " + days + " dana");
			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static int days(int year, String month) {

		if (month.equalsIgnoreCase("feb")) {
			if ((year % 100 == 0 && year % 4 != 0) || year % 400 == 0) {
				return 29;
			} else {
				return 28;
			}

		} else if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("mar") || month.equalsIgnoreCase("maj")
				|| month.equalsIgnoreCase("jul") || month.equalsIgnoreCase("avg") || month.equalsIgnoreCase("okt")
				|| month.equalsIgnoreCase("dec")) {
			return 31;

		} else if (month.equalsIgnoreCase("apr") || month.equalsIgnoreCase("jun") || month.equalsIgnoreCase("sep")
				|| month.equalsIgnoreCase("nov")) {
			return 30;
		}
		return 0;

	}

}
