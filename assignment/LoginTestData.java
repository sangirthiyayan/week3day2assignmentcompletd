package week2.day2.assignment;

public class LoginTestData extends TestData {
	public void  enterusername() {
		System.out.println("username: sangirthiyayan");

	}
	 public void enterpassword() {
		System.out.println("passeord: sans@123");
		

	}
	 public static void main(String[] args) {
		 
		 LoginTestData data = new LoginTestData();
		 data.enterCredentials();
		 data.enterusername();
		 data.enterpassword();
		 data.navigateToHomePage();
		 
		
	}
}
