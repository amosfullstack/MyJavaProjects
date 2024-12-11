
public class Main {
	public static void main(String[]args){
	String x = "Amos";
	String y = "Daniel";
	String temp;
	
	System.out.println("The unswapped String");
	System.out.println("x: " +x);
	System.out.println("y: "  +y);
	
	temp=x;
	x=y;
	y=temp;
	
	System.out.println("The Swapped Strings");
	System.out.println("x: " +x);
	System.out.println("y: " +y);
		
	}
	

}
