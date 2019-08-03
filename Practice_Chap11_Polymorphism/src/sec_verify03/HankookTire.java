package sec_verify03;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " HankookTire ¼ö¸í : " + (maxRotation-accumulateRotation) + "È¸");
			return true;
		}
		else {
			System.out.println(location + " HankookTire »§²Ù");
			return false;
		}
	}
}
