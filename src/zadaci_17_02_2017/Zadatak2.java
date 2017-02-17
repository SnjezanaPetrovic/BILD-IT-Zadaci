package zadaci_17_02_2017;

public class Zadatak2 {
	// Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na
	// primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su također
	// twin primes. Napisati program koji ispisuje sve twin prime brojeve manje
	// od 10000, 10 parova po liniji.

	public static void main(String[] args) {

		int count = 0;
		for (int i = 2; i < 10000 - 2; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf("%12s", (i + " " + (i + 2)));
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

}
