package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak3 {
	// Napišite program koji će brojati broj karaktera, riječi i linija teksta u
	// nekom fileu. Riječi trebaju biti odvojene jednim spaceom. Ime file
	// proslijediti
	// kao argument u vaš program.

	public static void main(String[] args) {
		// Uzimamo od korisnika ime fajla
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		String fileName = input.nextLine();
		Path path = Paths.get(fileName + ".txt");

		int numberOfLines = 0;
		int numberOfWords = 0;
		int numberOfCharacters = 0;

		// Učitavamo podatke iz fajla liniju po liniju
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;

			// Linije splitujemo po razmacima izmedju riječi i pri tome ih
			// stavljamo u niz i sabiramo ih,usput brojimo linije
			while ((line = reader.readLine()) != null) {
				numberOfLines++;

				String[] elements = line.split(" ");
				numberOfWords += elements.length;

				// Prodjemo kroz svaki niz i po dužini elemenata sabiramo broj
				// karaktera
				for (int i = 0; i < elements.length; i++) {
					numberOfCharacters += elements[i].length();
				}

			}
		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		// Ispisujemo rezultate
		System.out.println("Broj linija je " + numberOfLines);
		System.out.println("Broj riječi je " + numberOfWords);
		System.out.println("Broj karaktera je " + numberOfCharacters);
		input.close();

	}

}
