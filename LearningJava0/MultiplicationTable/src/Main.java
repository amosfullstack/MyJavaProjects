
public class Main {
	public static void main(String[] args) {
		for(int i=1; i<=12; i++) {
			System.out.println("Table "+i);
			for(int j=1; j<=12; j++) {
				System.out.print(i+" "+"*"+" "+j+" = "+i*j+" ");
				System.out.println();
			}
		}
	}

}