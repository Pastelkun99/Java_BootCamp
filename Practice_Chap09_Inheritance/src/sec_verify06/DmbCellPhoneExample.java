package sec_verify06;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbphone = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println(dmbphone);

		dmbphone.powerOn();
		dmbphone.bell();
		dmbphone.sendVoice("여보세요");
		dmbphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbphone.sendVoice("아~ 예 반갑습니다.");
		dmbphone.hangUp();
		dmbphone.turnonDmb();
		dmbphone.changeChannelDmb(12);
		dmbphone.turnOffDmb();

	}

}
