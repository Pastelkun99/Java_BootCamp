package sec_verify05;

import java.util.Vector;

public class PointVectorExample {

	public static void main(String[] args) {
		
		Vector<Point> v1 = new Vector<Point>();
		
		v1.add(new Point(2, 3));
		v1.add(new Point(-5, 20));
		v1.add(new Point(30, -8));
		
		System.out.println(v1.get(0));
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		
	}
}
