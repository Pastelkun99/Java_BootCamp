package sec_verify03;

public class SportsCar extends Car {

	public int getSpeed() {
		return super.speed;
	}
	
	public void stop() {
		if(super.speed == 0) {
			//System.out.println("���� ����ϴ�.");
			super.stop();
			System.out.println("������ī�� ����ϴ�.");
			System.out.println("���� ������ī�� �ӵ��� " + getSpeed() + "Km �Դϴ�.");
		}
		else {
			System.out.println("�θ��θ�");
		}
	}
}
