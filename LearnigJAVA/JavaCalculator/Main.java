import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Creating a Scanner Object to read input from the key Board
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int firstNo = input.nextInt();

        System.out.print("Enter the Operation: ");
        String operation = input.next();
        char operationChar = operation.charAt(0);

        System.out.print("Enter the Second Number: ");
        int secondNo = input.nextInt();

        //call the compute method and pass the values
        int result = Calc.Compute(firstNo,operationChar,secondNo);

        System.out.println("The answer is: "+ result );

    }
}