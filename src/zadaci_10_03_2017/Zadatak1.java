package zadaci_10_03_2017;

public class Zadatak1 {
	// (NumberFormatException) Write the bin2Dec(String binaryString)
	// method to convert a binary string into a decimal number. Implement the
	// bin2Dec method to throw a NumberFormatException if the string is not a
	// binary string.

	public static void main(String[] args) {

		System.out.println(bin2Dec("1100100"));
		System.out.println(bin2Dec("100500fg00"));

	}

	public static int bin2Dec(String binary) throws NumberFormatException {

		if (!isBinary(binary)) {
			throw new NumberFormatException(binary + " is not a binary number.");
		}
		int power = 0;
		int decimal = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {

			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, power);
			}
			power++;
		}
		return decimal;
	}

	public static boolean isBinary(String binary) {

		for (char ch : binary.toCharArray()) {
			if (ch != '1' && ch != '0')
				return false;
		}
		return true;
	}

}
