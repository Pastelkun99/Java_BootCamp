package sec02_exam_DrawShape;

public class Shape {

	String color = "black";
	
	//�⺻ ������(������ �˾Ƽ� �߰�)
	public Shape() {}
	
	public void draw() {
		//%n : ����
		System.out.printf("[ color = %s ] %n", color);
	}
}
