package sec_verify03;

public class Tire {

	public int maxRotation;
	public int accumulateRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire ¼ö¸í : " + (maxRotation-accumulateRotation) + "È¸");
			return true;
		}
		else {
			System.out.println("~~~~~~~ " + location + " Tire ÆãÅ© ~~~~~~~~");
			return false;
		}
	}
}
