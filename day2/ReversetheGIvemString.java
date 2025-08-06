package week3.day2;

public class ReversetheGIvemString {

	public static void main(String[] args) {

		String companyName = "TestLeaf";

		// int count = 0;

		char[] reverse = companyName.toCharArray();

		System.out.println("the reverse of the strings: ");

		for (int i = reverse.length - 1; i >= 0; i--) {
			System.out.print(reverse[i]);

		}
	}

}
