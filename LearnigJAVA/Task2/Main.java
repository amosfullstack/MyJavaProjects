import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Create the Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstName = input.nextLine();
        
        System.out.print("Your Name is: ");
        System.out.println(firstName);
    }
}