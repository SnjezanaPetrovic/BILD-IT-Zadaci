package mini_4_hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		System.out.println("*********Hangman********");
		// pokrećemo igru
		start(input);
		input.close();

	}

	// metoda koja pokreće igru
	public static void start(Scanner input) throws IOException {

		ArrayList<String> words = Input.readWordsFromFile();
		String randomWord = Input.readInRandomWord(words);

		try {

			Hangman.game(randomWord, input);

		} catch (Exception ex) {
			System.out.println("Error!!!");
			ex.getMessage();

		}

	}

}
