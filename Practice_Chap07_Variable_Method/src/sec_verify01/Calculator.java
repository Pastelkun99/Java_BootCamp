package sec_verify01;

public class Calculator {

	boolean power = false;
	int plus;
	
	public void power() {
		if(power == false) {
			System.out.println("���� ������ �մϴ�.");
			power = !power;
		}
		else {
			System.out.println("���� ������ ���ϴ�.");
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

