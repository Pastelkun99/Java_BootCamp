package sec_verify07;

public class Bird extends Pet {

	String type;
	boolean flightYN;
	
	public boolean getFlight() {
		return true;
	}
	
	public Bird(String type, boolean flightYN) {
		this.type = type;
		this.flightYN = flightYN; 
	}
	
	public void move() {
		System.out.print("새의 종류는 " + this.type + "이고, ");
		if(flightYN == true) {
			System.out.println("날 수 있습니다.");
		}
		else {
			System.out.println("날 수 없습니다.");
		}
	}
}
