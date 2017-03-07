package mini_4_hangman;

import java.util.Scanner;

public class Hangman {

	public static String displayWord(char[] letters) {

		String word = "";
		for (int i = 0; i < letters.length; i++) {
			word += letters[i];

		}

		return word;

	}

	public static void game(String randomWord, Scanner input) {

		// pravimo dva niza,jedan sa slovima iz riječi a drugi sa crticama
		char[] letters = new char[randomWord.length()];
		char[] underscores = new char[randomWord.length()];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = randomWord.charAt(i);

		}
		for (int i = 0; i < underscores.length; i++) {
			underscores[i] = '_';

		}

		try {
			int count = 0;
			// imamo 6 pokušaja
			while (count < 6) {
				boolean noMatch = true;
				// uzimamo slovo od korisnika
				System.out.print("Enter a letter in word  > ");
				char ch = input.next().charAt(0);
				// provjeravamo da li je uneseni znak slovo,ako jeste
				// nastavljamo igru ,ako ne ispisujemo poruku korisniku da je
				// dozvoljeno unijeti samo slovo
				if (!Character.isLetter(ch)) {
					System.out.println("Invalid input.Please enter a letter.");
				} else {

					for (int i = 0; i < underscores.length; i++) {
						if (ch == letters[i]) {
							underscores[i] = letters[i];

							noMatch = false;
						}

					}
					// ako korisnik nije pogodio nacrtamo mu vješala sa
					// trenutnim stanjem
					if (noMatch) {
						count++;
						printHangman(count);
						// ako promaši 6 puta izgubio je
						if (count == 6) {
							System.out.println("You lost!!!!!");
							break;
						}

					}
					// provjeravamo ima li još crtica tj. ako je broj ispisanih
					// slova jednak dužini riječi korisnik je pobijedio
					System.out.println(underscores);
					int countLetters = 0;
					for (int i = 0; i < underscores.length; i++) {
						if (underscores[i] != '_') {
							countLetters++;
							if (countLetters == underscores.length) {
								System.out.println("You won!!!!!\nYou missed " + count
										+ " times.\nDo you want to guess another word? Enter y or n>");
								char choice = input.next().charAt(0);

								if (choice == 'y') {
									App.start(input);

								} else if (choice == 'n') {
									System.out.println("Good buy!!!");
								} else {
									System.out.println("Invalid input.Please enter y or n");
								}

								break;

							}
						}

					}
				}

			}
		} catch (Exception ex) {
			System.out.println("Error!!!");
			ex.getMessage();

		}

	}

	// metoda koja crta vješala u zavisnosti koliko puta je korisnik promašio
	public static void printHangman(int count) {

		if (count == 1) {
			System.out.println(" _______");
			System.out.println(" |     |");
			System.out.println(" O     |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");

		} else if (count == 2) {
			System.out.println(" _______");
			System.out.println(" |     |");
			System.out.println(" O     |");
			System.out.println(" |     |");
			System.out.println(" |     |");
			System.out.println("       |");
			System.out.println("       |");

		} else if (count == 3) {
			System.out.println(" _______");
			System.out.println(" |     |");
			System.out.println(" O     |");
			System.out.println("/|     |");
			System.out.println(" |     |");
			System.out.println("       |");
			System.out.println("       |");

		} else if (count == 4) {
			System.out.println(" _______");
			System.out.println(" |     |");
			System.out.println(" O     |");
			System.out.println("/|\\    |");
			System.out.println(" |     |");
			System.out.println("       |");
			System.out.println("       |");

		} else if (count == 5) {
			System.out.println(" _______");
			System.out.println(" |     |");
			System.out.println(" O     |");
			System.out.println("/|\\    |");
			System.out.println(" |     |");
			System.out.println("/      |");
			System.out.println("       |");

		} else if (count == 6) {
			System.out.println(" _______");
			System.out.println(" |     |");
			System.out.println(" O     |");
			System.out.println("/|\\    |");
			System.out.println(" |     |");
			System.out.println("/ \\    |");
			System.out.println("       |");

		}
	}

}
