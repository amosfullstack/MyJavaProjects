import java.util.Scanner;

public class Main {
	public static void main(String[] argsA) {
		
		Scanner studentName = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String Name=studentName.nextLine();
		
		Scanner studentAge = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int Age = studentAge.nextInt();
		
		Scanner studentLoan = new Scanner(System.in);
		System.out.print("Enter your Loan Amount: ");
		double loanBoard = studentLoan.nextDouble();
		
		Scanner studentProgram = new Scanner(System.in);
		System.out.print("What is your degree Program: ");
		String degreeProgram = studentProgram.nextLine();
		
		
		System.out.println("Your Name is: "+Name +".");
		System.out.println("You are "+Age+" years Old.");
		System.out.println("Loan Board gives you "+loanBoard+" tzs.");
		System.out.println("You study"+degreeProgram+".");
	}

}
