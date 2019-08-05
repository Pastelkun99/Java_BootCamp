package sec05_verify;

public class Circle extends Shape {

	double r;

	public Circle(double r) {
		this.r = r;
	}

	public Circle(Point p, double r) {
		this(r);
		super.p = p;
	}

	@Override
	public double calcArea() {
		double result = r * r * Math.PI;
		return result;
	}

}
