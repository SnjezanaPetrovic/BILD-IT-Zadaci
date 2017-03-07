package zadaci_06_03_2017;

public class MyCharacter {

	private char value;

	public MyCharacter(char value) {
		this.value = value;
	}

	public char charValue() {
		return this.value;
	}

	public static int compare(char x, char y) {
		if ((int) x > (int) y)
			return 1;
		else if ((int) x < (int) y)
			return -1;
		else
			return 0;
	}

	public static boolean isDigit(char ch) {
		return (ch > 47 && ch < 58);
	}

	public static boolean isLetter(char ch) {
		return ((ch > 64 && ch < 91) || (ch > 96 && ch < 123));
	}

	public static boolean isLowerCase(char ch) {
		return (ch > 96 && ch < 123);
	}

	public static boolean isUpperCase(char ch) {
		return (ch > 64 && ch < 91);
	}

	public static char toLowerCase(char ch) {
		if (isLowerCase(ch))
			return ch;
		else
			return (char) (ch - 65 + 97);
	}

	public static char toUpperCase(char ch) {
		if (isUpperCase(ch))
			return ch;
		else
			return (char) (ch - 97 + 65);
	}

	public boolean equals(MyCharacter ch) {
		return this.value == ch.charValue();
	}

}
