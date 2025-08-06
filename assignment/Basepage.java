package week2.day2.assignment;

public class Basepage {
	
	public void findElement() {
		System.out.println("find the element from WebElement");

	}
	
	public void clickElement() {
		System.out.println("click the element");
		
	}
	
	public void enterText() {
		System.out.println("Enter the text in the field");
		
	}
	
	public void performCommonTasks() {
		System.out.println("perform common task in Basepage");
		
	}
	
	public static void main(String[] args) {
	Basepage base = new Basepage();
	base.findElement();
	base.clickElement();
	base.performCommonTasks();
	base.enterText();
	}
	
	

}
//findElement(), clickElement(), enterText() and performCommonTasks()