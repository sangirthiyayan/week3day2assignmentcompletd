package week3.day2;

public class FindOccurence {

	public static void main(String[] args) {
		 
      String input = "TestLeaf";

   
      char multiple = 'e';

   
      int count = 0;

     
      char[] check = input.toCharArray();

     
      for (int i = 0; i <  check.length; i++) {
     
          if (check [i] == multiple) {
              count++;
          }
      }

      
      System.out.println(count );

		}

	}


