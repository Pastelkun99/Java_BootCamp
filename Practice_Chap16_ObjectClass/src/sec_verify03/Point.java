package sec_verify03;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Point p) {
		if(p instanceof Point) {
			Point comparePoint = (Point)p;
			if(this.x == comparePoint.x && this.y == comparePoint.y) {
				return true;
			}
		}
		return false;
	} 
	
	public String toString() {
		return "x : " + x + "이며, y : " + y +"이다.";
	}
	
}
