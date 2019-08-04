package sec_verify01;

public class SamsungHandPhoneExample {

	public static void main(String[] args) {
		
		SamsungHandPhone sam = new SamsungHandPhone();
		
		sam.setcompany("Samsung");
		sam.setcompany("LG");
		sam.setmodel("디지바이스");
		sam.setmodel("Galaxy5");
		sam.setcolor("white");
		sam.setrelease(2013);
		
		if(sam.company == null || sam.model == null || sam.color == null || sam.release < 2007) {
			System.out.println("");
		}
		else {
			System.out.println(sam);	
		}
		
		// 올바른 입력값이 아니면 객체의 각 멤버변수에 대입되지 않도록 설계합니다.
		// 이는 프로그래밍에서 객체에 들어가는 값을 점검하여 정상적인 작동을 보장할 수 있게 됩니다.
	}

}
