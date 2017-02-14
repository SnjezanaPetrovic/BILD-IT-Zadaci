package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati program koji pita korisnika da unese neki string te mu ispisuje
	// sve karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako
	// korisnik unese string Beijing Chicago, program vraća BiigCiao.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Unesite neki string: ");
			String str = input.nextLine();
			System.out.println("Karakteri na neparnim pozicijama su: ");

			for (int i =0 ; i < str.length(); i += 2) {
				System.out.print(str.charAt(i));

			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

}
