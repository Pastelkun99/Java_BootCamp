package sec_verify03;

public class PointExample {

	public static void main(String[] args) {

		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(3, 10);
		
		System.out.println("현재 생성된 인스턴스이다.");
		System.out.println("Point num1의 필드값 : " + p1.toString());
		System.out.println("Point num2의 필드값 : " + p2.toString());
		System.out.println("Point num3의 필드값 : " + p3.toString());
		
		if(p1.equals(p2)) {
			System.out.println("num1의 필드와 num2의 필드는 같다.");
		}
		else {
		}
		
	}

}
