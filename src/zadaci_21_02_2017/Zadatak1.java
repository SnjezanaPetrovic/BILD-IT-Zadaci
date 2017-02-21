package zadaci_21_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	// (Izračunavanje napojnice) Napisati program koji učitava ukupan iznos
	// računa koji treba uplatiti kao i procenat tog računa kojeg želimo platiti
	// kao napojnicu te izračunava ukupan račun i napojnicu. Na primjer, ukoliko
	// korisnik unese 10 kao račun i 15 % kao procenat za napojnicu program
	// treba da ispiše da je ukupan račun za uplatiti 11.5 a napojnica 1.5.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo iznos računa i postotak napojnice od korisnika
			System.out.println("Unesite iznos računa: ");
			double bill = input.nextDouble();
			System.out.println("Unesite procenat napojnice: ");
			double tipPercentage = input.nextDouble();
			// rečun mora biti veći od 0 a postotak 0 ili veći
			if (bill > 0 && tipPercentage >= 0) {
				calculateBillAndTip(bill, tipPercentage);
			} else {
				System.out.println("Račun mora biti veći od 0 a procenat napojnice 0 ili pozitivan broj.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite brojeve.");
		}
		input.close();

	}

	// Metoda koja izračunava napojnicu u cijeli račun i ispisuje rezultat
	public static void calculateBillAndTip(double bill, double tipPercentage) {

		double tip = bill * tipPercentage / 100;
		double wholeBill = bill + tip;
		System.out.println("Napojnica je " + tip + " a cijeli račun dodje " + wholeBill + ".");

	}

}
