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
		System.out.print("���� ������ " + this.type + "�̰�, ");
		if(flightYN == true) {
			System.out.println("�� �� �ֽ��ϴ�.");
		}
		else {
			System.out.println("�� �� �����ϴ�.");
		}
	}
}
