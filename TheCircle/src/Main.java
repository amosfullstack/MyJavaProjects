import java.awt.*;
public class Main {

	public static void main(String[] args) {
		//Creating the new Objects of the Circle class
		Circle c1 = new Circle();
		System.out.println(c1.radius);
		System.out.println(c1.center);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		Circle c2 = new Circle(new Point(1,2),5);
		System.out.println(c2.radius);
		System.out.println(c2.center);
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		

	}

}
