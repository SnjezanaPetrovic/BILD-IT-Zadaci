package zadaci_21_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	// Napišite metodu sa sljedećim headerom koja vraća naopako ispisan broj
	// koji joj je proslijeđen kao argument: public static void reverse(int
	// number). Na primjer, reverse(3456) treba da vrati 6543. Napisati program
	// koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan
	// naopako.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Uzimamo broj od korisnika
			System.out.println("Unesite neki cijeli broj: ");
			int num = input.nextInt();
			System.out.println("Broj ispisan naopako: ");
			// Pozivamo metodu koja ispisuje broj naopako
			reverse(num);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite cijeli broj.");
		}
		input.close();

	}

	// Metoda koja ispisuje broj naopako
	public static void reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		System.out.println(reverse);
	}

}
