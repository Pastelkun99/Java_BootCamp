package sec_verify02;

public class SupersonicAirplane extends Airplane {

	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}
		else{
			super.fly();
		}
	}

}
