package sec_verify03;

public class PointExample {

	public static void main(String[] args) {

		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(3, 10);
		
		System.out.println("���� ������ �ν��Ͻ��̴�.");
		System.out.println("Point num1�� �ʵ尪 : " + p1.toString());
		System.out.println("Point num2�� �ʵ尪 : " + p2.toString());
		System.out.println("Point num3�� �ʵ尪 : " + p3.toString());
		
		if(p1.equals(p2)) {
			System.out.println("num1�� �ʵ�� num2�� �ʵ�� ����.");
		}
		else {
		}
		
	}

}
