package sec_verify01;

public class Calculator {

	boolean power = false;

	public void powerOn() {
		if (power == false) {
			System.out.println("계산기 전원을 켭니다.");
			power = !power;
		} else {
			System.out.println("전원이 이미 켜져 있습니다.");
		}
	}

	public int plus(int x, int y) {
		if (this.power)
			return x + y;
		else
			System.out.println("계산기 전원이 켜지지 않았습니다.");
		return 0;

	}

	public double divide(double x, double y) {
		if (this.power)
			return x / y;
		else
			System.out.println("계산기 전원이 켜지지 않았습니다.");
		return 0;
	}

	public void powerOff() {
		if (power == true) {
			System.out.println("계산기 전원을 끕니다.");
			power = !power;
		} else {
			System.out.println("계산기 전원이 켜져 있지 않습니다.");
		}

	}

}
