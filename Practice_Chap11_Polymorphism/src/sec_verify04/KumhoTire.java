package sec_verify04;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " KumhoTire ¼ö¸í : " + (maxRotation-accumulateRotation) + "È¸");
			return true;
		}
		else {
			System.out.println(location + " KumhoTire »§²Ù");
			return false;
		}
	}
}