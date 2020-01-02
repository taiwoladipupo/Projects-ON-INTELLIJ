
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	 public static void main(String[] args) {

	}
	private double radius;

	public CircleFromSimpleGeometricObject(String color, boolean filled) {
		
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}


	

	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;

	}
//Return radius
	public double getRadius() {
		return radius;
	}
	//set radius
	public void setRadius(double radius) {
		this.radius = radius;
		
		
	}
	//get area
	public double getArea() {
		return radius * radius * Math.PI;
		
	}
	//get Perimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	//print the circleinfo
	public void printCircle() {
		System.out.println("The circe is created  " +getDateCreated() +  " and the radius is " + radius);
	}
	
}
