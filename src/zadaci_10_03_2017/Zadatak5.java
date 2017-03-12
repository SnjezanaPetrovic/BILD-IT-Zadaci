package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak5 {
	// (Process scores in a text file) Suppose that a text file contains an
	// unspecified
	// number of scores separated by blanks. Write a program that prompts the
	// user
	// to enter the file, reads the scores from the file, and displays their
	// total and
	// average.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");
		String fileName = input.nextLine();
		Path path = Paths.get(fileName + ".txt");

		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			int sum = 0;
			int count = 0;

			while ((line = reader.readLine()) != null) {

				String[] array = line.split(" ");
				for (int i = 0; i < array.length; i++) {
					int score = Integer.parseInt(array[i]);
					sum += score;
					count++;

				}

			}
			double average = sum * 1.0 / count;
			System.out.println("Total is: " + sum);
			System.out.println("Average is: " + average);
		} catch (IOException e) {
			e.getStackTrace();

		}
		input.close();

	}

}
