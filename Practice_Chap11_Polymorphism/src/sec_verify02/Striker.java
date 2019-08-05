package sec_verify02;

public class Striker extends Player {

	int shoot;

	public Striker(String name, int age, int backNumber, int spd, int shoot) {
		super(name, age, backNumber, spd);
		this.shoot = shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	public int getShoot() {
		return shoot;
	}

	public void infoPrint() {
		System.out.println("������ FW������ �Ұ��մϴ�.");
		super.infoPrint();
		System.out.println("��ȿ ���� : " + this.shoot);
	}
}
