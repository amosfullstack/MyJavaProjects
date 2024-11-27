import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.print("Please Enter your Name: ");
		
		Scanner fname =new Scanner(System.in);
		String Name = fname.nextLine();
		
		System.out.print("Please Enter your Age: ");
		Scanner fAge = new Scanner(System.in);
		int Age = fAge.nextInt();
	}

}
