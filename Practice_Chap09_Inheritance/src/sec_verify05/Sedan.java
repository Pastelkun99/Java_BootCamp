package sec_verify05;

public class Sedan extends Car {

	int seatNum;

	public int getseatNum() {
		return this.seatNum;
	}

	@Override
	public String toString() {
		super.speed = 300;
		super.color = "�����";
		this.seatNum = 5;
		return "�¿��� �ӵ��� " + super.getSpeed() + "km, ������ " + super.getcolor() + " �¼��� " + this.getseatNum() + "�� �Դϴ�.";
	}
}
