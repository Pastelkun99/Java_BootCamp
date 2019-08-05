package sec05_verify;

public abstract class Shape {

	Point p;

	public Point getPosition() {
		return p;
	}

	public void setPosition(Point p) {
		this.p = p;
	}

	public Shape() {
		p = new Point();
	}

	public Shape(Point p) {
		this();
		this.p = p;
	}

	public abstract double calcArea();

}
