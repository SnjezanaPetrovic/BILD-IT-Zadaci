package zadaci_18_02_2017;

public class Zadatak2 {
	// Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
	// ukljućujući i 2 i 1000. Program treba da ispiše 8 brojeva po liniji te
	// razmak između brojeva treba da bude jedan space.

	public static void main(String[] args) {

		int count = 0;
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				count++;
				System.out.print(i + " ");
				if (count % 8 == 0) {
					System.out.println();
				}
			}
		}

	}

	// metoda koja vraća true ako je broj prost
	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

}
