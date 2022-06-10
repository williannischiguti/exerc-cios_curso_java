package poo.rectangle;

public class Rectangle {
	
	double width;
	double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 *(width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
		
	}
}