package sec02_verify;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		System.out.println(owner + "�� ���Դϴ�.");
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
	public void internetSearch() {
		System.out.println("���̹��� �˻� �մϴ�.");
	}
	
	
}
