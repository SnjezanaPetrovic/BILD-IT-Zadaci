package zadaci_10_03_2017;

public class Zadatak2 {
	// (OutOfMemoryError) Write a program that causes the JVM to throw an
	// OutOfMemoryError and catches and handles this error.

	public static void main(String[] args) {
	
		try {
			int[] temp = new int[1111111111];
			temp = new int[temp.length * 1111111111];
		} catch (OutOfMemoryError ex) {
			System.out.println(" OutOfMemoryError!!");
			ex.printStackTrace();
		}

	}

}
