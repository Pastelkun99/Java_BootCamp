package sec_verify05;

public class Truck extends Car {

	int capacity;

	public int getcapacity() {
		return this.capacity;
	}

	@Override
	public String toString() {
		super.speed = 100;
		super.color = "�Ķ���";
		this.capacity = 50;
		return "Ʈ�� �ӵ��� " + super.getSpeed() + "km, ������ " + super.getcolor() + " ���緮�� " + this.getcapacity() + "�� �Դϴ�.";
	}
}
