package sec_verify06;

public class Cellphone {

	String model;
	String color;
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String a) {
		System.out.println("자기 : " + a);
	}
	
	public void receiveVoice(String a) {
		System.out.println("상대방 : " + a);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
