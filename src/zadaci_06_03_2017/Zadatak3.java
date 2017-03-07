package zadaci_06_03_2017;

public class Zadatak3 {
	// (Implement the Character class) The Character class is provided in the
	// Java
	// library. Provide your own implementation for this class. Name the new
	// class
	// MyCharacter.

	public static void main(String[] args) {

		MyCharacter ch = new MyCharacter('N');

		System.out.println(MyCharacter.compare('A', 'N'));

		System.out.println(MyCharacter.isDigit('9'));

		System.out.println(MyCharacter.isLetter('g'));

		System.out.println(MyCharacter.isLowerCase('N'));

		System.out.println(MyCharacter.isUpperCase('A'));

		System.out.println(MyCharacter.toLowerCase('N'));

		System.out.println(MyCharacter.toUpperCase('n'));

		System.out.println(ch.equals(new MyCharacter('N')));

	}

}
