
public class Main {
	public static void main(String[]args) {
		int[] ages = {10,44,23,33,23,43,54,21,43,54,12,23,65,78,98};
		int noOfAges=ages.length;
		float sum=0;
		float average;
		float average2;
		
		for(int i=0; i<noOfAges; i++) {
			sum+=ages[i];
		}
		average = sum/noOfAges;
		System.out.println("The Average of the Ages is: "+average);
		
		//using for each loop
		int sum1=0;
		for(int i: ages) {
			sum1+=i;
		}
		average2 = sum1/noOfAges;
		System.out.println("The Average of the Ages is: " +average2);
		
		
	}

}