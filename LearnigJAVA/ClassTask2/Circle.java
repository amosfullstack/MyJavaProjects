import java.awt.*;
//The above is the impotation of the class for buildind the graphical user interfaces
public class Circle{
    Point center;
    double radius;

    //Creating constructors for the Circle Class
    Circle(){} //This is the zero constructor;
    Circle(Point center,double radius){
        this.center = center;
        this.radius = radius;
    }

    //CReating the mecthods / actions for our Circle Class
    double getPerimeter(){
        return 2*Math.PI*radius ;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    void setCenter(Point center){
        this.center = center;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

}
