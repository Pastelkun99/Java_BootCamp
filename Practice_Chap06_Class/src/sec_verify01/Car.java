package sec_verify01;

import java.util.Scanner;

public class Car {

	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxspeed = 350;
	int nowspeed = 0;
	public int amp;
	
	public void speedcon() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �ӵ���? : ");
		nowspeed = scanner.nextInt();
		if(nowspeed > maxspeed) {
			System.out.println("���� ���� ���� �ӵ��� �ٿ��ּ���.");
			System.out.println(this.toString());
			speedcon();
		} else {
			System.out.println(this.toString());
			speedcon();
		}
		
	}
	@Override
	public String toString() {
		return "����ȸ�� : " + this.company +
				"\n�𵨸� : " + this.model + 
				"\n���� : " + this.color +
				"\n�ְ�ӵ� : " + this.maxspeed +
				"\n����ӵ� : " + this.nowspeed;
	}
}
