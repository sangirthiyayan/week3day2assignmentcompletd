package week3.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] a = { 4, 3, 6, 1, 2, 7, 8 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			if (a[i] != i + 1) {

				System.out.println("Missing Number is: " + (i + 1));
				break;
			}

		}

	}

}
