package sec_verify01;

public class Calculator {

	boolean power = false;
	int plus;
	
	public void power() {
		if(power == false) {
			System.out.println("계산기 전원을 켭니다.");
			power = !power;
		}
		else {
			System.out.println("계산기 전원을 끕니다.");
			power = !power;
		}
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public double divide(double x, double y) {
		return x / y;
	}
	
	public void poweroff() {
		this.power = !this.power;
	}
	
}

