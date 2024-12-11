import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		System.out.println("Hello World");
		Greeting.sayHi();
		//Greeting.sayHello();
		
		System.out.println("Enter your Favourite Number");
		Scanner favouriteNo = new Scanner(System.in);
		int favNo = favouriteNo.nextInt();
		
		System.out.print("Your Favourite Number is:" +favNo);
		//System.out.print(favNo);


	}
	
}
