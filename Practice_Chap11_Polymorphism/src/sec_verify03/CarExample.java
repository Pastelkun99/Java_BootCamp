package sec_verify03;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		for (int i = 0; i < 5; i++) {

			int problemlocation = car.run();

			switch (problemlocation) {
			case 1:
				System.out.println("�տ��� KumhoTire���� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� Ÿ�̾� ��ȣ�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����", 13);
				break;
			default:
			}
			System.out.println("--------------------------------");
		}

	}
}
