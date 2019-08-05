package sec_verify03;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		for (int i = 0; i < 5; i++) {

			int problemlocation = car.run();

			switch (problemlocation) {
			case 1:
				System.out.println("앞왼쪽 KumhoTire으로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 타이어 금호로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 13);
				break;
			default:
			}
			System.out.println("--------------------------------");
		}

	}
}
