package zadaci_06_03_2017;

public class Zadatak5 {
	// (Implement the StringBuilder class) The StringBuilder class is provided
	// in the Java library. Provide your own implementation for the following
	// methods
	// (name the new class MyStringBuilder1):
	// public MyStringBuilder1(String s);
	// public MyStringBuilder1 append(MyStringBuilder1 s);
	// public MyStringBuilder1 append(int i);
	// public int length();
	// public char charAt(int index);
	// public MyStringBuilder1 toLowerCase();
	// public MyStringBuilder1 substring(int begin, int end);
	// public String toString();

	public static void main(String[] args) {

		MyStringBuilder1 str1 = new MyStringBuilder1("This is a test");

		System.out.println(str1.append(new MyStringBuilder1("First time")));

		System.out.println(str1.append(300));

		System.out.println(str1.length());

		System.out.println(str1.charAt(7));

		System.out.println(str1.toLowerCase());

		System.out.println(str1.substring(2, 6));

		System.out.println(str1.toString());

	}

}
