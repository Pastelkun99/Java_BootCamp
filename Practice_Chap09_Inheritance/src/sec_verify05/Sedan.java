package sec_verify05;

public class Sedan extends Car {

	int seatNum;

	public int getseatNum() {
		return this.seatNum;
	}

	@Override
	public String toString() {
		super.speed = 300;
		super.color = "³ë¶û»ö";
		this.seatNum = 5;
		return "½Â¿ëÂ÷ ¼Óµµ´Â " + super.getSpeed() + "km, »ö±òÀº " + super.getcolor() + " ÁÂ¼®Àº " + this.getseatNum() + "°³ ÀÔ´Ï´Ù.";
	}
}
