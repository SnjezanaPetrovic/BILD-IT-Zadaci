package zadaci_21_02_2017;

public class Zadatak4 {
	// Palindrome prime je prosti broj koji je također i palindrom. Na primjer,
	// 131 je palindrome prime, kao i brojevi 313 i 757. Napisati program koji
	// ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.

	public static void main(String[] args) {
		int num = 2;
		int count = 0;
		while (count < 100) {
			if (isPrime(num) && isPalindrom(num)) {

				System.out.printf("%7d", num);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
			num++;
		}

	}

	// metoda koja vraća true ako je broj prost
	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// metoda koja vraća broj okrenut naopako
	public static int reverseNum(int num) {

		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		return reverse;

	}

	// metoda koja vraća true ako je broj palindrom
	public static boolean isPalindrom(int num) {
		return num == reverseNum(num);
	}

}
