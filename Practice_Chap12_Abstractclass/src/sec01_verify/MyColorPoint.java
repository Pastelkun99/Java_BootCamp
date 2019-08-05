package sec01_verify;

public class MyColorPoint extends MyPoint {

	String color;

	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void move(int x, int y) {
		System.out.println("���� x, y�� �� : " + this.x + ", " + this.y + ", " + this.color);
	}

	public void reverse() {
		this.x = 4;
		this.y = 3;
		System.out.println("x�� y�� ���� �ٲ���ϴ�.");
	}

	@Override
	public void show() {
		System.out.println("���� x, y�� �� : " + this.x + ", " + this.y + ", " + this.color);
	}

}
