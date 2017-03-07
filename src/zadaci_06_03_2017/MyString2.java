package zadaci_06_03_2017;

public class MyString2 {

	private String s;

	public MyString2(String s) {
		this.s = s;
	}

	public int compare(String s) {
		int result = 0;

		for (int i = 0; i < Math.min(s.length(), s.length()); i++) {

			char ch = s.charAt(i);
			char ch1 = s.charAt(i);

			if (ch != ch1) {
				result = (int) ch1 - (int) ch;
			}
		}
		return result;
	}

	public MyString2 substring(int begin) {
		String result = "";

		for (int i = begin; i < s.length(); i++) {
			result += s.charAt(i);
		}
		return new MyString2(result);
	}

	public MyString2 toUpperCase() {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				result += (char) (s.charAt(i) - 32);
			else
				result += s.charAt(i);
		}

		return new MyString2(result);
	}

	public char[] toChars() {
		char[] result = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			result[i] = s.charAt(i);
		}
		return result;
	}

	public static MyString2 valueOf(boolean b) {
		if (b)
			return new MyString2("true");
		else
			return new MyString2("false");
	}

	public String toString() {
		return s;
	}

}
