package sec05_verify;

public class Rect extends Shape {

	double width;
	double height;
	
	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rect(Point p, double width, double height) {
		super.p = p;
		this.width = width;
		this.height = height;
	}
	
	public boolean isSquare() {
		return false;
	}
	
	@Override
	public double calcArea() {
		double result = width*height;
		return result;
	}
}
