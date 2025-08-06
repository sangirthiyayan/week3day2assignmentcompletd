package week2.day2.assignment;

public class LoginPage extends Basepage {
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("perform common task in login page");
		
	}
	
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.performCommonTasks();
		
	}
	
	

}
