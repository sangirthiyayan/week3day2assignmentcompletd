package week2.day2.assignment;

public class APIClient {
	 public void sendRequest(String endpoint) {
		System.out.println( " Endpoint: "+endpoint);

	}
	 public void sendRequest(String endpoint,String requestBody,boolean requestStatus ) {
			System.out.println("Endpoint: "+endpoint);
			System.out.println("RequestBody: "+requestBody);
			System.out.println("requestStatus: "+requestStatus);

		}
		 
	 
	 public static void main(String[] args) {
		 APIClient ap = new APIClient();
		 
		 ap.sendRequest("http://api.login.com");
		 ap.sendRequest("http://api.login.com", "data", false);
		 
		
	}
}
