package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	// U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji
	// pita korisnika da unese short broj te mu ispiše svih 16 bita za dati
	// cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu
	// ispisuje 0000000000000101

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo broj od korisnika
			System.out.println("Unesite cijeli broj: ");
			int number = input.nextInt();
			// ispisujemo rrezultat
			for (int i = 15; i >= 0; i--) {
				System.out.print((number >> i) & 1);
			}

		} catch (Exception ex) {
			System.out.println(
					"Došlo je do greške.Molimo unesite cijeli broj manji od 2140000000 i veći od -2140000000.");
		}
		input.close();

	}

}
