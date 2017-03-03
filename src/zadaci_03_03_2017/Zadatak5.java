package zadaci_03_03_2017;

public class Zadatak5 {
	// (Displaying the prime numbers) Write a program that displays all the
	// prime
	// numbers less than 120 in decreasing order. Use the StackOfIntegers class
	// to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display
	// them in
	// reverse order.

	public static void main(String[] args) {
		// pravimo objekat
		StackOfIntegers primeNumbers = new StackOfIntegers();
		// tražimo proste brojeve i smještamo ih u stack
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				primeNumbers.push(i);
			}

		}
		// ispisujemo vrijednosti koje smo ubacili u stack obrnutim redosljedom
		while (primeNumbers.getSize() != 0) {
			System.out.print(primeNumbers.pop() + " ");
		}

	}

	// metoda koja vraca true ako je broj prost
	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
