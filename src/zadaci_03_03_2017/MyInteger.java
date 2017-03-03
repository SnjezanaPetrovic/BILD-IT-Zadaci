package zadaci_03_03_2017;

public class MyInteger {

	private int value;

	public MyInteger() {

	}

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return (0 == (value % 2));
	}

	public boolean isOdd() {
		return (1 == (value % 2));
	}

	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if ((value % i) == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isEven(int value) {
		return (0 == (value % 2));

	}

	public static boolean isOdd(int value) {
		return (1 == (value % 2));
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if ((value % i) == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isEven(MyInteger object) {
		return (0 == (object.getValue() % 2));
	}

	public static boolean isOdd(MyInteger object) {
		return (1 == (object.getValue() % 2));
	}

	public static boolean isPrime(MyInteger object) {
		for (int i = 2; i < object.getValue(); i++) {
			if ((object.getValue() % i) == 0) {
				return false;
			}
		}
		return true;

	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger object) {
		return this.value == object.getValue();

	}

	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}

}
