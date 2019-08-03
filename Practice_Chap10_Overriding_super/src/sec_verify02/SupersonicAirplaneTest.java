package sec_verify02;

public class SupersonicAirplaneTest {

	public static void main(String[] args) {
		
		SupersonicAirplane spa = new SupersonicAirplane();
		spa.takeOff();
		spa.fly();
		spa.flymode = SupersonicAirplane.SUPERSONIC;
		spa.fly();
		spa.flymode = SupersonicAirplane.NORMAL;
		spa.fly();
		spa.land();
		
	}

}
