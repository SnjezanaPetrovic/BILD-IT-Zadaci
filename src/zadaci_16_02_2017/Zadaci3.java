package zadaci_16_02_2017;

public class Zadaci3 {
	// Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
	// liniji, koji su djeljivi i sa 5 i sa 6. Razmak između brojeva treba biti
	// tačno jedan space.

	public static void main(String[] args) {

		int count = 0;
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}

	}

}
