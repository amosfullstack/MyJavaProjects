
public class Main {

	public static void main(String[] args) {
		int [][] myNumbers = {{1,2,3,4},{5,6,7}};
		myNumbers[1][2] = 8;
	/*	System.out.print(myNumbers[0][0]+ "\s");
		System.out.print(myNumbers[0][1]+"\s");
		System.out.print(myNumbers[0][2]+ "\s");
		System.out.print(myNumbers[0][3]+ "\s\n");
		System.out.print(myNumbers[1][0]+ "\s");
		System.out.print(myNumbers[1][1]+ "\s");
		System.out.print(myNumbers[1][2]+ "\s");*/
		
		for(int i=0; i<myNumbers.length; i++) {
			for(int j=0; j<myNumbers[i].length; j++) {
				System.out.print(myNumbers[i][j]+"\s" );
			}}
	}
   
}
