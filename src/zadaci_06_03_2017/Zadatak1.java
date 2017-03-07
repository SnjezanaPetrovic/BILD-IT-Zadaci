package zadaci_06_03_2017;

public class Zadatak1 {
	// (Implement the String class) The String class is provided in the Java
	// library.
	// Provide your own implementation for the following methods (name the new
	// class MyString1):
	// public MyString1(char[] chars);
	// public char charAt(int index);
	// public int length();
	// public MyString1 substring(int begin, int end);
	// public MyString1 toLowerCase();
	// public boolean equals(MyString1 s);
	// public static MyString1 valueOf(int i);

	public static void main(String[] args) {
		

		char[] chars = {'N', 'i', 'k', 'i', 't', 'a','T','e','s','t'};
		MyString1 str1 = new MyString1(chars);
		

		System.out.println(str1.charAt(5));
		
		
		System.out.println(str1.length());
		
		
		System.out.println(str1.substring(2, 6));
		
		
		MyString1 low = new MyString1(chars);
		System.out.println(low.toLowerCase().toString());
		
		
		System.out.println(str1.equals(low));
		
		
		System.out.println(MyString1.valueOf(123456).toString());
		

	}

}
