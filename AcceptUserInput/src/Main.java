
import java.util.Scanner;
public class Main {
  public static void main(String[]args) {
   Scanner scanner = new Scanner (System.in);
   
   System.out.println("What is your name?");
   String name = scanner.nextLine();
   
   System.out.println("How Old are you?");
   int age = scanner.nextInt();
   scanner.nextLine();
   
   System.out.println("What is your favourite food?");
   String food = scanner.nextLine();
   System.out.println("\n");
   
   System.out.println("Your Name is " +name);
   System.out.println("You are "+age+" years Old.");
   System.out.println("Your favourite food is " +food);
  
}
  
}
