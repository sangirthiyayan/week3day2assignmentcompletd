package week3.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindInsertion {

	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		
		System.out.println("The matching element are: ");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				Arrays.sort(a);
				Arrays.sort(b);

				if (a[i] == b[j]) {

					System.out.println(a[i]);

				} else {

				}

			}

		}

	}
}
