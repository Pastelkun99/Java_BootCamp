package sec_verify07;


public class Point implements Cloneable {

	int xPos;
	int yPos;
	
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		
	}
	
	public void changePos(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.print("[" + this.xPos + " , " + this.yPos + "]");
	}
	
	public Object clone() {
		Object cloned = null;
		try {
			cloned = (Object)super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("null");
		}
		return cloned; 
	}
	
}
