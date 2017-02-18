package zadaci_18_02_2017;

import java.util.GregorianCalendar;

public class Zadatak3 {
	// Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi
	// od 1. januara 1970 do trenutka pozivanja metode. Napisati program koji
	// ispisuje trenutačni datum i vrijeme u formatu "Trenutni datum i vrijeme:
	// 22. juli, 2015 19:59:47"

	public static void main(String[] args) {

		GregorianCalendar test = new GregorianCalendar();
		// pozivamo metodu koja nam vraća ime mjeseca
		String month = getNameOfTheMonth(test.get(GregorianCalendar.MONTH) + 1);
		// pomoću klase Gregorian calendar i metode koja pretvara milisekunde u
		// sate,minute i sekunde ispisujemo trenutni datum i vrijeme
		System.out.println("Trenutni datum i vrijeme: " + test.get(GregorianCalendar.DAY_OF_MONTH) + ". " + month + ","
				+ test.get(GregorianCalendar.YEAR) + " " + convertMillis(System.currentTimeMillis()));

	}

	// pretvaramo milisekunde u sate,minute i sekunde
	public static String convertMillis(long millis) {

		long seconds = millis / 1000;
		long minutes = seconds / 60;
		seconds %= 60;
		long hours = minutes / 60;
		minutes %= 60;
		hours %= 24;
		return (hours + 1) + ":" + minutes + ":" + seconds;

	}

	// Metoda koja vraća ime mjeseca
	public static String getNameOfTheMonth(int month) {

		String nameOfTheMonth = "";

		switch (month) {
		case 1:
			nameOfTheMonth = "januar";
			break;
		case 2:
			nameOfTheMonth = "februar";
			break;
		case 3:
			nameOfTheMonth = "mart";
			break;
		case 4:
			nameOfTheMonth = "april";
			break;
		case 5:
			nameOfTheMonth = "maj";
			break;
		case 6:
			nameOfTheMonth = "jun";
			break;
		case 7:
			nameOfTheMonth = "juli";
			break;
		case 8:
			nameOfTheMonth = "avgust";
			break;
		case 9:
			nameOfTheMonth = "septembar";
			break;
		case 10:
			nameOfTheMonth = "octobar";
			break;
		case 11:
			nameOfTheMonth = "novembar";
			break;
		case 12:
			nameOfTheMonth = "decembar";
			break;

		}
		return nameOfTheMonth;

	}

}
