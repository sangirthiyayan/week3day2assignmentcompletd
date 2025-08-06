package week3.day2;

import java.util.Iterator;

public class Uppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (i % 2 != 0) {

				charArray[i] = Character.toUpperCase(charArray[i]);

			}
		}

		String value = new String(charArray);
		System.out.println(value);

	}

}
