package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak4 {
	// (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
	// object, a Date object, a string, and a Circle object to the list, and use
	// a loop
	// to display all the elements in the list by invoking the object’s
	// toString()
	// method.

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();

		list.add(new Loan(10, 10, 50000));
		list.add(new Circle(8));
		list.add("Nikita Test");
		list.add(new Date());

		list.forEach(System.out::println);


	}

}
