import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner yourName = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String clientName = yourName.nextLine();
		
		Scanner yourAge = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		double clientAge = yourAge.nextDouble();
		
		System.out.println(clientName+"!"+" You are "+clientAge+" years Old");
	
	}

}
