package sec_verify03;

public class SportsCarExample {

	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar();
		System.out.println("���� ������ī�� �ӵ��� " + sc.getSpeed() + "Km �Դϴ�.");
		sc.speedUp();
		sc.speedUp();
		sc.speedUp();
		sc.speedDown();
		sc.speedDown();
		sc.speedDown();
		sc.stop();
		
	}
}
