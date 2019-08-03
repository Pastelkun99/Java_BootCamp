package sec_verify01;

import java.util.Scanner;

public class Car {

	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxspeed = 350;
	int nowspeed = 0;
	public int amp;
	
	public void speedcon() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 속도는? : ");
		nowspeed = scanner.nextInt();
		if(nowspeed > 350) {
			System.out.println("엔진 과열 위험");
			System.out.print("수정할 속도는? : ");
			nowspeed = scanner.nextInt();
		}
		scanner.close();
				
	}
	@Override
	public String toString() {
		return "제작회사 : " + this.company +
				"\n모델명 : " + this.model + 
				"\n색깔 : " + this.color +
				"\n최고속도 : " + this.maxspeed +
				"\n현재속도 : " + this.nowspeed;
	}
}
