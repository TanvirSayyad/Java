package oops.p1.p2;

abstract public class Shapes {
	// this is common structure
	abstract double CalculateArea();

}

class Circle extends Shapes {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	double CalculateArea() {
		// TODO Auto-generated method stub
		return 314 * radius * radius;
	}

}

class Rectangle extends Shapes {
	private double width;
	private double height;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;

	}


	@Override
	double CalculateArea() {
		// TODO Auto-generated method stub
		return height * width;
	}

}

class Cyl extends Shapes {
	private double radius;

	public Cyl(double radius) {
		this.radius=radius;
		
	}

	@Override
	double CalculateArea() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * radius * radius;
	}
	
	
}

