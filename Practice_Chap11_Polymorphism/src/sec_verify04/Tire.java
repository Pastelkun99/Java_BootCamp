package sec_verify04;

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
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println("~~~~~~~ " + location + " Tire ��ũ ~~~~~~~~");
			return false;
		}
	}
}
