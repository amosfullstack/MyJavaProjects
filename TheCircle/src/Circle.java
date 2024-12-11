import java.awt.*;
public class Circle {
	
	//creating the attributes of the circle class
	Point center;
	double radius;
	
	//creating the constructors
	Circle(){} //This is the zero constructor, it takes no arguments ie Construcor 1
	
	Circle(Point center,double radius){
		this.center = center;
		this.radius = radius;
	}
	
	//Creating the methods of the Circle class
	double getPerimeter() {
		return 2* Math.PI* radius;
	}
	
	double getArea() {
		return Math.PI*radius*radius;
	}
	
	void setCenter(Point center) {
		this.center = center;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	

}
