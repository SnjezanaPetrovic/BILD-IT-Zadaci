package zadaci_06_03_2017;

public class MyStringBuilder1 {

	private String s;

	public MyStringBuilder1(String s) {
		this.s = s;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {

		this.s += s;

		return new MyStringBuilder1(this.s);

	}

	public MyStringBuilder1 append(int i) {

		String temp = "";

		while (i != 0) {
			temp = i % 10 + temp;
			i /= 10;
		}
		return new MyStringBuilder1(this.s + temp);

	}

	public int length() {

		return s.length();

	}

	public char charAt(int index) {

		return s.charAt(index);

	}

	public MyStringBuilder1 toLowerCase() {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				result += s.charAt(i);
			} else if (s.charAt(i) == ' ') {
				result += ' ';
			} else {
				result += (char) (s.charAt(i) - 65 + 97);
			}
		}

		return new MyStringBuilder1(result);

	}

	public MyStringBuilder1 substring(int begin, int end) {

		String temp = "";
		for (int i = begin; i < end; i++) {

			temp += s.charAt(i);

		}
		return new MyStringBuilder1(temp);

	}

	public String toString() {

		return this.s;

	}

}
