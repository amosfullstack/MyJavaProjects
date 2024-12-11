import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your favourite interger: ");
        int favNo = input.nextInt();

        System.out.println("Your favourite number is "+favNo+" it is an interger too!");
    }
}