package week2.day2.assignment;

public class ReverseOddWordInString {
	public static void main(String[] args) {
		String input = "I am a software tester"; 
	     String[] split = input.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				split[i] = new StringBuilder(split[i]).reverse().toString();
			}
			
		}
		
		String result = String.join(" ", split);
		System.out.println(result);
	}
	
}
