package zadaci_06_03_2017;

public class Zadatak4 {
	// (New string split method) The split method in the String class returns an
	// array of strings consisting of the substrings split by the delimiters.
	// However, the
	// delimiters are not returned. Implement the following new method that
	// returns
	// an array of strings consisting of the substrings split by the matching
	// delimiters,
	// including the matching delimiters.
	// public static String[] split(String s, String regex)
	// For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
	// array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
	// #, and e in an array of String.

	public static void main(String[] args) {

		String[] str1 = Split.split("NikitaTestNikitaTest", "Test");
		for (String s : str1) {
			System.out.println(s);
		}

		String[] str2 = Split.split("ab#12#453", "#");
		for (String s : str2) {
			System.out.println(s);
		}

	}

}
