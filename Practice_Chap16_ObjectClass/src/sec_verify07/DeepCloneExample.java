package sec_verify07;

public class DeepCloneExample {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10,10, -5, -5);
		System.out.println("원래 직사각형의 포인트");
		System.out.println("[ 직사각형의 위치 정보 ]");
		r1.showPosition();
		
		
		Rectangle r2 = (Rectangle)r1.clone();
		System.out.println();
		System.out.println("복제된 직사각형의 포인트");
		System.out.println("[ 직사각형의 위치 정보 ]");
		r2.changePos(2, 2, 7, 7);
		r2.showPosition();
		
		
	}

}
