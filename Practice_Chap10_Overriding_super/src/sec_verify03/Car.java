package sec_verify03;

public class Car {

	int speed;
	
	public final void speedUp() {
		this.speed = speed + 10;
		System.out.println("���� ������ī�� �ӵ��� " + this.speed + "Km �Դϴ�.");
	}
	
	public void speedDown() {
		this.speed = speed - 10;
		System.out.println("���� ������ī�� �ӵ��� " + this.speed + "Km �Դϴ�.");
	}
	
	public void stop() {
		if(this.speed == 0)
		System.out.println("���� ����ϴ�.");
	}
}
