package sec02_verify;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		System.out.println(owner + "의 폰입니다.");
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

	public void internetSearch() {
		System.out.println("네이버를 검색 합니다.");
	}

}
