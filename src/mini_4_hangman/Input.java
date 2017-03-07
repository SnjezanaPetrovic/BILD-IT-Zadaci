package mini_4_hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Input {

	// metoda koja učitava riječi iz fajla i smješta ih u listu
	public static ArrayList<String> readWordsFromFile() throws IOException {
		ArrayList<String> words = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("hangman.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				words.add(line);

			}
			reader.close();

		} catch (Exception ex) {
			System.out.println("Error!!!");
			ex.getMessage();

		}
		return words;
	}

	// metoda koja uzima iz liste nasumično jednu riječ
	public static String readInRandomWord(ArrayList<String> words) {

		String word = "";

		word = words.get((int) (Math.random() * words.size()));

		return word;

	}
}