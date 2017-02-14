package mini1_Kalendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Reminder {
	static Scanner input = new Scanner(System.in);

	// Metoda kojom upisujemo napomenu u fajl
	public static void addReminder() throws IOException {

		Path path = Paths.get("reminders.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		// Uzimamo datum i napomenu od korisnika
		System.out.println("Enter date (dd.mm.yyyy): ");
		String date = input.nextLine();
		if (isValidDate(date)) {
			try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
				writer.write(date);
				System.out.println("Enter reminder: ");
				String reminder = input.nextLine();
				writer.write(" " + reminder);
				writer.newLine();
			} catch (Exception ex) {
				System.out.println("Invalid input.");
			} finally {
				System.out.println("Reminder has been added.\nAnything else?");
				App.displayMenu();
			}
		} else {
			System.out.println("Date isn't valid.It has to be in dd.mm.yyyy format.");
		}

	}

	// Metoda za printanje cijelog fajla
	public static void printReminders() throws IOException {

		try (BufferedReader reader = Files.newBufferedReader(Paths.get("reminders.txt"))) {

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception ex) {
			System.out.println("Error!");
		} finally {
			System.out.println("Anything else? ");
			App.displayMenu();
		}
	}

	// Metoda za printanje samo jedne linije u fajlu
	public static void printReminderForADate() throws IOException {
		System.out.println("Enter date (dd.mm.yyyy): ");
		String date = input.nextLine();
		if (isValidDate(date)) {
			try (BufferedReader reader = Files.newBufferedReader(Paths.get("reminders.txt"))) {
				String line;
				// Ako je uneseni datum jednak datumu unesenom na početku reda u
				// fajlu,ispisujemo taj red
				while ((line = reader.readLine()) != null) {
					String[] elements = line.split(" ");
					if (date.equals(elements[0])) {
						System.out.println(line);
					}
				}

			} catch (Exception ex) {
				System.out.println("Error!");
			} finally {
				System.out.println("Anything else? ");
				App.displayMenu();
			}
		} else

		{

			System.out.println("Date isn't valid.It has to be in dd.mm.yyyy format.");
		}

	}

	// Validacija datuma
	public static boolean isValidDate(String date) {

		if (date.length() != 10) {
			return false;
		} else if (date.charAt(2) != '.' || date.charAt(5) != '.') {
			return false;
		} else if (!isNotValidDay(date)) {
			return false;
		}
		return true;
	}

	public static boolean isNotValidDay(String date) {
		// Pretvaramo datum u niz elemenata da bi mogli dobiti dan,mjesec i
		// godinu
		// kao broj koji možemo provjeriti

		String[] array = date.split("\\.");
		int day = Integer.parseInt(array[0]);
		int month = Integer.parseInt(array[1]);
		int year = Integer.parseInt(array[2]);
		// Provjeravamo da li je datum u redu
		if (year > 0 && month > 0 && month <= 12 && day <= Calendar.getNumberOfDays(month, year)) {
			return true;
		}
		return false;

	}

}
