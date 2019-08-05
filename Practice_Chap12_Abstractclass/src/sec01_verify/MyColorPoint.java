package sec01_verify;

public class MyColorPoint extends MyPoint {

	String color;

	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void move(int x, int y) {
		System.out.println("현재 x, y의 값 : " + this.x + ", " + this.y + ", " + this.color);
	}

	public void reverse() {
		this.x = 4;
		this.y = 3;
		System.out.println("x와 y의 값을 바꿨습니다.");
	}

	@Override
	public void show() {
		System.out.println("현재 x, y의 값 : " + this.x + ", " + this.y + ", " + this.color);
	}

}
