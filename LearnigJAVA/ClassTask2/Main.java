import java.awt.*;
public class Main {

    public static void main(String[] args ){
        Circle c1 = new Circle();
        c1.setCenter(new Point(4,5));
        c1.setRadius(7);

        Circle c2 = new Circle(new Point(2,3),6);

        System.out.print("The Perimeter of the circle One is: ");
        System.out.println(c1.getPerimeter());
        System.out.print("The Area of the Circle One is: ");
        System.out.println(c1.getArea());
        
        //Calculating the Shit for C2
        System.out.print("The Perimeter of the circle c2 is: ");
        System.out.println(c2.getPerimeter());
        System.out.print("The Area of the Circle c2 is: ");
        System.out.println(c2.getArea());
    }

    
}
