package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak4 {
	// (Count characters, words, and lines in a file) Write a program that will
	// count
	// the number of characters, words, and lines in a file. Words are separated
	// by
	// whitespace characters. The file name should be passed as a command-line
	// argument

	public static void main(String[] args) {

		// Uzimamo od korisnika ime fajla
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");
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
			System.out.println("Error!");
		}
		// Ispisujemo rezultate
		System.out.println("File " + fileName + " has:");
		System.out.println(numberOfCharacters + " characters");
		System.out.println(numberOfWords + " words");
		System.out.println(numberOfLines + " lines");

		input.close();

	}

}
