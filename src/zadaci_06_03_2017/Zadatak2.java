package zadaci_06_03_2017;



public class Zadatak2 {
	// (Implement the String class) The String class is provided in the Java
	// library.
	// Provide your own implementation for the following methods (name the new
	// class MyString2):
	// public MyString2(String s);
	// public int compare(String s);
	// public MyString2 substring(int begin);
	// public MyString2 toUpperCase();
	// public char[] toChars();
	// public static MyString2 valueOf(boolean b);

	public static void main(String[] args) {

		MyString2 str = new MyString2("Nikita");

		System.out.println(str.compare("Nikita"));
		System.out.println(str.compare("Test"));

		MyString2 sub = str.substring(3);
		System.out.println(sub.toString());

		MyString2 value = MyString2.valueOf(true);
		System.out.println(value.toString());

		System.out.println(str.toUpperCase().toString());

		char[] test = str.toChars();

		for (int i = 0; i < test.length; i++)
			System.out.println(test[i]);

	}
}
