package sec_verify06;

public class Cellphone {

	String model;
	String color;
	
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	public void sendVoice(String a) {
		System.out.println("�ڱ� : " + a);
	}
	
	public void receiveVoice(String a) {
		System.out.println("���� : " + a);
	}
	
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
