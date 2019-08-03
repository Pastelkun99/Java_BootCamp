package sec_verify05;

public class Circle {

	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle compareCircle = (Circle)obj;
			if(this.radius == compareCircle.radius) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ") ¹ÝÁö¸§ : " + radius;
		
	}
	
}
