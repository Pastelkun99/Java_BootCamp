package sec02_exam_DrawShape;

public class DrawShapeExample {

	public static void main(String[] args) {
		
		//point �迭�� ���� �ʱ�ȭ
		Point[] p = new Point[] {
				new Point(100, 100),
				new Point(140, 50),
				new Point(200, 100)
		};
		
	//�ʱ�ȭ�� �迭�� 2���� �ּҰ��� Triangle�����ڿ� �ּҰ����� �ѱ��.
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		Circle c1 = new Circle();
		
		t.color = "���";
		c.color = "�Ķ�";
		c1.color = "���";
		System.out.println("�ﰢ���� �� �� (��ǥ) ��� ������ ��Ÿ��");
		t.draw(); //�ﰢ���� �׸���. �ڼ� Ŭ���� �������̵��� draw ȣ��
		
		System.out.println("���� ������ ������, ������ ��Ÿ��");
		c.draw(); //���� �׸���. �ڼ� Ŭ���� �������̵��� drawȣ��
		c1.draw();

	}

}
