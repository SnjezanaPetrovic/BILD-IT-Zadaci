package zadaci_13_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak1 {
	// Pretpostavimo da uplatimo $100 svaki mjesec na štedni račun koji ima
	// godišnju interesnu stopu od 5%. Mjesečna interesna stopa je stoga 0.05 /
	// 12 = 0.00417. Nakon prvog mjeseca vrijednost na računu postaje 100 * (1 +
	// 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na računu postaje
	// (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon trećeg mjeseca,
	// vrijednost na računu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i
	// tako dalje. Napisati program koji pita korisnika da unese mjesečni iznos
	// štednje te broj mjeseci nakon kojeg bi želio znati stanje računa.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.###");
		// Uzimamo podatke od korisnika
		try {
			System.out.println("Unesite mjesečni iznos štednje: ");
			double amount = input.nextDouble();
			System.out.println("Unesite broj mjeseci nakon kojeg želite znati stanje na računu: ");
			int months = input.nextInt();
			//Ispisujemo rezultat
			System.out.println("Stanje na računu će biti: " + df.format(balance(amount, months)));

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}
		input.close();
	}

	/**
	 * 
	 * @param amount
	 *            =iznos stednje
	 * @param months
	 *            =broj mjeseci
	 * @return iznos na racunu nakon odredjeni broj mjeseci
	 */
	public static double balance(double amount, int months) {

		double balance = 0;
		for (int i = 0; i < months; i++) {
			balance = (amount + balance) * (1 + 0.00417);

		}
		return balance;

	}

}
