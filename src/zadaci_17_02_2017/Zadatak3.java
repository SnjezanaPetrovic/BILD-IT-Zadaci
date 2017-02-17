package zadaci_17_02_2017;

public class Zadatak3 {
	// Napisati program koji ispisuje sve moguće kombinacije za biranje dva
	// broja u rasponu od 1 do 7. Također, program ispisuje broj svih mogućih
	// kombinacija. Dakle, program treba da ispiše sve moguće parove brojeva u
	// datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj mogućih kombinacija
	// je 21.

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				count++;
			}

		}
		System.out.println("Broj mogućih kombinacija je " + count);

	}

}
