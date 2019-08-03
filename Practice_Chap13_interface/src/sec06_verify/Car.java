package sec06_verify;

public class Car {

	Tire frontleftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;
	
	public void run() {
		frontleftTire = new HankookTire();
		frontleftTire.roll();
		backLeftTire = new KumhoTire();
		backLeftTire.roll();
		
	}
}
