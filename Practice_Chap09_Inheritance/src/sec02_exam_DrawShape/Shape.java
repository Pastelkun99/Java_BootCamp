package sec02_exam_DrawShape;

public class Shape {

	String color = "black";
	
	//기본 생성자(없으면 알아서 추가)
	public Shape() {}
	
	public void draw() {
		//%n : 개행
		System.out.printf("[ color = %s ] %n", color);
	}
}
