package sec_verify01;

public class Calculator {

	boolean power = false;

	public void powerOn() {
		if (power == false) {
			System.out.println("���� ������ �մϴ�.");
			power = !power;
		} else {
			System.out.println("������ �̹� ���� �ֽ��ϴ�.");
		}
	}

	public int plus(int x, int y) {
		if (this.power)
			return x + y;
		else
			System.out.println("���� ������ ������ �ʾҽ��ϴ�.");
		return 0;

	}

	public double divide(double x, double y) {
		if (this.power)
			return x / y;
		else
			System.out.println("���� ������ ������ �ʾҽ��ϴ�.");
		return 0;
	}

	public void powerOff() {
		if (power == true) {
			System.out.println("���� ������ ���ϴ�.");
			power = !power;
		} else {
			System.out.println("���� ������ ���� ���� �ʽ��ϴ�.");
		}

	}

}
