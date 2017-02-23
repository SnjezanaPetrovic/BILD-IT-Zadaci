package zadaci_23_02_2017;

import java.util.GregorianCalendar;

public class Zadatak4 {
	// Napisati metodu koja vraća datum i trenutačno vrijeme.

	public static void main(String[] args) {

		System.out.println(dateAndTime());
	}

	// Metoda koja vraća datum i tačno vrijeme
	public static String dateAndTime() {
		GregorianCalendar test = new GregorianCalendar();

		return "Trenutni datum i vrijeme: " + test.get(GregorianCalendar.DAY_OF_MONTH) + "."
				+ (test.get(GregorianCalendar.MONTH) + 1) + "." + test.get(GregorianCalendar.YEAR) + "   "
				+ test.get(GregorianCalendar.HOUR) + ":" + test.get(GregorianCalendar.MINUTE) + ":"
				+ test.get(GregorianCalendar.SECOND);
	}
}
