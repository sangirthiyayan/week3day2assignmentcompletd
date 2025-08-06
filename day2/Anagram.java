package week3.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String name1 = "starts";
		String name2 = "arttss";

		if (name1.length() == name2.length()) {

			char[] element = name1.toCharArray();

			char[] element2 = name2.toCharArray();

			Arrays.sort(element);

			Arrays.sort(element2);

			if (Arrays.equals(element, element2)) {
				System.out.println("the given string are Anagram");
			} else {
				System.out.println("the given string are not Anagram");

			}

		} else {
			System.out.println("Length mismatch");
		}

	}

}
