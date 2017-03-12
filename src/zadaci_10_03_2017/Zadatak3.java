package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
	// (Remove text) Write a program that removes all the occurrences of a
	// specified
	// string from a text file. For example, invoking
	// java Exercise12_11 John filename
	// removes the string John from the specified file. Your program should get
	// the
	// arguments from the command line

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<>();

		boolean isOn = true;
		while (isOn) {
			System.out.println("Enter the name of the file: ");
			String fileName = input.nextLine();
			Path path = Paths.get(fileName);

			if (!Files.exists(path)) {
				System.out.println("File doesn't exist.");
				continue;
			}

			printFile(fileName);

			System.out.print("\nEnter string that you want to remove: ");
			String str = input.nextLine();

			if (isInsideTheText(fileName, str)) {

				fileToList(list, fileName);
				removeString(list, str);
				rewriteFile(list, fileName);
				printFile(fileName);

			} else {
				System.out.println("String doesn't exist.");
				printFile(fileName);
			}
			isOn = false;

		}

		input.close();

	}

	public static void printFile(String fileName) {
		Path path = Paths.get(fileName);
		String line = "";
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();

		}
	}

	public static boolean isInsideTheText(String fileName, String str) {
		Path path = Paths.get(fileName);
		String line = "";
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			while ((line = reader.readLine()) != null) {
				if (line.contains(str)) {
					return true;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();

		}
		return false;
	}

	public static void fileToList(ArrayList<String> list, String fileName) {
		Path path = Paths.get(fileName);
		String line = "";

		try (BufferedReader reader = Files.newBufferedReader(path)) {
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();

		}
	}

	public static void removeString(ArrayList<String> list, String str) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(str)) {
				start = list.get(i).indexOf(str);
				end = start + str.length();
				String str2 = list.get(i).substring(0, start);
				str2 = str2 + list.get(i).substring(end);

				list.set(i, str2);
			}
		}

	}

	public static void rewriteFile(ArrayList<String> list, String fileName) {

		Path path = Paths.get(fileName);

		try {
			BufferedWriter writer = Files.newBufferedWriter(path);
			for (int i = 0; i < list.size(); i++) {
				if (i == list.size() - 1) {
					writer.write(list.get(i));
					break;
				}
				writer.write(list.get(i));
				writer.newLine();
			}
			writer.close();
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}

}
