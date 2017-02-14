package mini1_Kalendar;

import java.io.IOException;
import java.util.Scanner;

public class App {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.println("******* Welcome *******");

		displayMenu();

	}

	// Glavni meni
	public static void displayMenu() throws IOException {

		System.out.println("------------------------");
		System.out.println(
				"Choose an option:\n--------------------\n1.Display calendar\n2.Enter reminder\n3.See all reminders\n4.See reminders for specific date\n5.Log out");

		boolean valid = true;
		int choice = 0;

		while (valid) {
			// Uzimamo izbor od korisnika
			boolean validChoice = false;
			while (!validChoice) {
				try {
					System.out.print("Enter your choice :");
					choice = input.nextInt();
					validChoice = true;

				} catch (Exception ex) {
					System.out.println("Invalid input.Choose 1,2,3 or 4 please");
					input.nextLine();
				}
			}
			System.out.println();

			switch (choice) {
			case 1:
				// pozivamo metode za validaciju kalendara i ispis kalendara i
				// pozivamo pomoćni meni
				validateCalendar();
				calendarMenu();
				break;
			case 2:
				// pozivamo metodu za upis podsjetnika u fajl
				Reminder.addReminder();
				break;
			case 3:
				// pozivamo metodu za ispis svega iz fajla
				Reminder.printReminders();
				break;
			case 4:
				// pozivamo metodu za ispis samo jedne linije u fajlu
				Reminder.printReminderForADate();
				break;
			case 5:
				System.out.println("You successfully loged out.Good buy.");
				break;
			default:
				System.out.println("Invalid input.Choose 1,2,3 or 4 please.");
				break;
			}

		}
		input.close();
	}

	// Pomoćni meni
	public static void calendarMenu() throws IOException {
		System.out.println("------------------------");
		System.out.println("Do you want to :\n--------------------\n1.Enter reminder\n2."
				+ "Display calendar for some other month\n3Log out");

		boolean valid = true;
		int choice = 0;

		while (valid) {
			// Uzimamo izbor od korisnika
			boolean validChoice = false;
			while (!validChoice) {
				try {
					System.out.print("Enter your choice :");
					choice = input.nextInt();
					validChoice = true;

				} catch (Exception ex) {
					System.out.println("Invalid input.Choose 1, or 2 please");
					input.nextLine();
				}

			}
			System.out.println();

			switch (choice) {
			case 1:
				// pozivamo metodu za upis podsjetnika u fajl
				Reminder.addReminder();
				break;
			case 2:
				// pozivamo metode za validaciju kalendara i ispis kalendara i
				// pozivamo pomoćni meni
				validateCalendar();
				calendarMenu();
				break;
			case 3:
				System.out.println("You successfully loged out.Good buy.");
				break;
			default:
				System.out.println("Invalid input.Choose 1,2 or 3 please.");
				break;
			}
			valid = false;
		}

	}

	// Metoda za validaciju kalendara
	public static void validateCalendar() {

		try {
			// provjeravamo da li je odabir mjeseca validan
			System.out.print("Enter month as a number from 1 to 12 :");
			int month = input.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("Invalid input.Choose numbers from 1 to 12 please.");
				input.nextLine();
				month = input.nextInt();

			}
			// provjeravamo godinu.Ja sam dozvolila samo godine u novoj eri
			System.out.print("Enter a year :");
			int year = input.nextInt();
			if (year < 0) {
				System.out.println("Enter a year in A.D. please.");
				year = input.nextInt();

			}
			// pozivamo metodu za ispis kalendara
			Calendar.printCalendar(month, year);

		} catch (Exception ex) {
			System.out.println("Invalid input.");

		}

	}

}
