class Point{
    //The point class is defined here with the x and y attributes
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
class Circle{
    //declaring attributes
    Point  center;
    double radius;

    //declaring methods for the Circle Class
    double getPerimeter(){
        return Math.PI*radius*2;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;

    }
    void setCenter(Point newCenter){
        center = newCenter;
    }

   // Circle() {
    //    this.center = new Point(0, 0); // Default center
       // this.radius = 1.0;            // Default radius
   // }
    
    
}

public class Main{
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.center = new Point(0,0);
        c1.radius = 3;
        c1.setRadius(5);
        c1.setCenter(new Point(1,2));

        System.out.println(c1.center);
        System.out.println(c1.radius);

    
    }
}