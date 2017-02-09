package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Napisati metodu koja prima jedan argument te simulira bacanje novčića
	// toliko
	// puta. Nakon što se simulacija završi, program ispisuje koliko puta je
	// novčić
	// pokazao glavu a koliko puta pismo.

	public static void main(String[] args) {
		// Uzimamo od korisnika broj koji odredjuje koliko puta će novčić biti
		// bačen
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko puta želite da novčić bude bačen? ");
		int numberOfTimes = input.nextInt();

		try {
			coinThrowing(numberOfTimes);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Unos mora biti cijeli broj.");

		}

		input.close();

	}

	public static void coinThrowing(int numberOfTimes) {

		// bacamo novčić generišemo nasumično 0 ili 1.Pismo je predstavljeno sa
		// 1 a glava sa 0
		int countHead = 0;
		for (int i = 0; i < numberOfTimes; i++) {
			int num = (int) (Math.random() * 2);
			// Ako je generisan broj 0 brojimo glave
			if (num == 0) {
				countHead++;
			}

		}
		// Ispisujemo riješenje
		System.out.println("Novčić je bačen " + numberOfTimes + " puta i to " + countHead + " puta glava i "
				+ (numberOfTimes - countHead) + " puta pismo");

	}

}
