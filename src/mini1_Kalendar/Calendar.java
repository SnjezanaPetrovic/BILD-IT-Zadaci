package mini1_Kalendar;

public class Calendar {

	public Calendar() {

	}

	public static void printCalendar(int month, int year) {
		// printamo naslov kalendara
		printCalendarTitle(month, year);
		// printamo sam kalendar
		printCalendarBody(month, year);

	}

	// metoda za printanje naslova kalendara
	public static void printCalendarTitle(int month, int year) {

		System.out.println("              " + getNameOfTheMonth(month) + " " + year);
		System.out.println("---------------------------------------");
		System.out.println("   Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		System.out.println();

	}

	// Metoda koja printa sam kalendar
	public static void printCalendarBody(int month, int year) {

		int startDay = getStartDay(month, year);

		int numberOfDays = getNumberOfDays(month, year);

		// Stavljamo prazna mjesta prije prvog dana u mjesecu
		for (int i = 0; i < startDay; i++) {
			System.out.print("     ");
		}

		// Ispisujemo dane u mjesecu
		for (int i = 1; i <= numberOfDays; i++) {
			System.out.printf("%5d", i);

			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}

		}
		System.out.println();

	}

	// Metoda kojom uneseni broj za mjesec pretvaramo u ime mjeseca
	public static String getNameOfTheMonth(int month) {

		String nameOfTheMonth = "";

		switch (month) {
		case 1:
			nameOfTheMonth = "January";
			break;
		case 2:
			nameOfTheMonth = "February";
			break;
		case 3:
			nameOfTheMonth = "March";
			break;
		case 4:
			nameOfTheMonth = "April";
			break;
		case 5:
			nameOfTheMonth = "May";
			break;
		case 6:
			nameOfTheMonth = "June";
			break;
		case 7:
			nameOfTheMonth = "July";
			break;
		case 8:
			nameOfTheMonth = "August";
			break;
		case 9:
			nameOfTheMonth = "September";
			break;
		case 10:
			nameOfTheMonth = "October";
			break;
		case 11:
			nameOfTheMonth = "November";
			break;
		case 12:
			nameOfTheMonth = "December";
			break;

		}
		return nameOfTheMonth;

	}

	// Metoda kojom dobijamo kojim danom mjesec počinje
	public static int getStartDay(int month, int year) {

		// Izracunavamo ukupan broj dana od 1.Januara 1800 do 1.u mjesecu koji
		// zelimo istampati
		final int START_DAY_FOR_JAN_1_1800 = 3;

		int totalNumberOfDays = 0;
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				totalNumberOfDays += 366;
			} else {
				totalNumberOfDays += 365;
			}
		}
		for (int i = 1; i < month; i++) {
			totalNumberOfDays += getNumberOfDays(i, year);
		}
		// Izračunavamo koji dan pada 1.u mjesecu koji zelimo istampati
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;

	}

	public static int getNumberOfDays(int month, int year) {

		// Odredjujemo koliko mjesec imaa dana
		if (month == 2) {
			// Ako je februar prestupne godine ima 29 a inace 28
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;

		} else {
			return 30;
		}

	}

	public static boolean isLeapYear(int year) {

		// Odredjujemo da li je godina prestupna
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

	}

}
