package zadaci_03_03_2017;

public class Zadatak2 {
	// (The MyInteger class) Design a class named MyInteger. The class contains:
	// ■ An int data field named value that stores the int value represented by
	// this
	// object.
	// ■ A constructor that creates a MyInteger object for the specified int
	// value.
	// ■ A getter method that returns the int value.
	// ■ The methods isEven(), isOdd(), and isPrime() that return true if the
	// value in this object is even, odd, or prime, respectively.
	// ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
	// return true if the specified value is even, odd, or prime, respectively.
	// ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
	// isPrime(MyInteger) that return true if the specified value is even, odd,
	// or prime, respectively.
	// ■ The methods equals(int) and equals(MyInteger) that return true if
	// the value in this object is equal to the specified value.
	// ■ A static method parseInt(char[]) that converts an array of numeric
	// characters to an int value.
	// ■ A static method parseInt(String) that converts a string into an int
	// value.
	// Draw the UML diagram for the class and then implement the class. Write a
	// client
	// program that tests all methods in the class.

	public static void main(String[] args) {
		// pravimo objekte i pozivamo metode iz MyInteger klase da bi ispisali
		// rezultat
		MyInteger integer1 = new MyInteger(40);
		MyInteger integer2 = new MyInteger(69);
		MyInteger integer3 = new MyInteger(236);
		MyInteger integer4 = new MyInteger(17);

		System.out.println("integer1:\n value:" + integer1.getValue() + "\n even:" + integer1.isEven() + "\n odd:"
				+ integer1.isOdd() + "\n prime:" + integer1.isPrime() + "\n equals:" + integer1.equals(40)
				+ "\n Integer:" + Integer.parseInt("40"));

		System.out.println("integer2:\n value:" + integer2.getValue() + "\n even:" + integer2.isEven() + "\n odd:"
				+ integer2.isOdd() + "\n prime:" + integer2.isPrime() + "\n equals:" + integer2.equals(40)
				+ "\n Integer:" + Integer.parseInt("69"));

		System.out.println("integer1:\n value:" + integer3.getValue() + "\n even:" + integer3.isEven() + "\n odd:"
				+ integer3.isOdd() + "\n prime:" + integer3.isPrime() + "\n equals:" + integer3.equals(40)
				+ "\n Integer:" + Integer.parseInt("236"));

		System.out.println("integer1:\n value:" + integer4.getValue() + "\n even:" + integer4.isEven() + "\n odd:"
				+ integer4.isOdd() + "\n prime:" + integer4.isPrime() + "\n equals:" + integer4.equals(40)
				+ "\n Integer:" + Integer.parseInt("17"));

	}

}
