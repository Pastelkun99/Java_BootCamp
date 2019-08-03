package sec_verify07;

public class Rectangle implements Cloneable {

	Point upperLeft;
	Point lowerRight;
	
	public Rectangle(int ax, int bx, int cx, int dx) {
		upperLeft = new Point(ax, bx);
		lowerRight = new Point(cx, dx);
	}
	
	public void changePos(int ax, int bx, int cx, int dx) {
		upperLeft.changePos(ax, bx);
		lowerRight.changePos(cx, dx);
	}
	
	public void showPosition() {
		System.out.print("좌 상단 : ");
		upperLeft.showPosition();
		System.out.println();
		System.out.print("우 하단 : ");
		lowerRight.showPosition();
		System.out.println();
	}
	
	public Object clone() {
		Rectangle cloned = null;
		try {
			cloned = (Rectangle)super.clone();
			cloned.upperLeft = (Point)this.upperLeft.clone();
			cloned.lowerRight = (Point)this.lowerRight.clone();
			
		} catch (CloneNotSupportedException e) {
			System.out.println("null");
		}
		return cloned; 
	}
}
