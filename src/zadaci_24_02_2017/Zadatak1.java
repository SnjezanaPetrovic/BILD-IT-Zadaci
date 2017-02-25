package zadaci_24_02_2017;

import java.util.Scanner;

//Napisati program koji prima ASCII kod (cijeli broj između 0 i 127) te ispisuje 
//koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII kod, 
//program mu ispisuje da je karakter sa tim brojem karakter E.

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			//Uzimamo broj od korisnika
			System.out.println("Unesite cijeli broj izmedju 0 i 127: ");
			int num = input.nextInt();
			//ispisujemo karakter pod tim brojem
			if (num > 0 && num <= 127) {
				System.out.println("Za ASCII kod " + num + " karakter je: " + ((char) num));
			} else {
				System.out.println("Morate unijeti cijeli broj veći od 0 i manji od 128.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Unesite cijeli broj.");
		}
		input.close();

	}

}
