package zadaci_20_02_2017;

public class Zadatak3 {
	// Napisati metodu sa sljedećim headerom: public static int isPrime(int n)
	// koja provjerava da li je broj prost/prime. Napsati test program koji
	// poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.

	public static void main(String[] args) {

		int count = 0;
		for (int i = 2; i < 100000; i++) {
			if (isPrime(i) == 1) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

	public static int isPrime(int n) {

		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
			}
		}
		if (prime) {
			return 1;
		} else {
			return 0;
		}
	}

}
