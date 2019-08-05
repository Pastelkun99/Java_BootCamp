package sec_verify05;

public class Truck extends Car {

	int capacity;

	public int getcapacity() {
		return this.capacity;
	}

	@Override
	public String toString() {
		super.speed = 100;
		super.color = "파란색";
		this.capacity = 50;
		return "트럭 속도는 " + super.getSpeed() + "km, 색깔은 " + super.getcolor() + " 적재량은 " + this.getcapacity() + "톤 입니다.";
	}
}
