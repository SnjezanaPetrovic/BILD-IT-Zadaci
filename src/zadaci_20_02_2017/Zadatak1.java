package zadaci_20_02_2017;

public class Zadatak1 {
	// Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
	// karaktera i 4 broja u sljedećem formatu AAA-1234. Napisati program koji
	// nasumično generiše tablicu.

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.print((char) ((int) (Math.random() * 26) + 65));
		}
		System.out.print("-");
		for (int i = 0; i < 4; i++) {
			System.out.print((int)(Math.random()*10));
		}

	}

}
