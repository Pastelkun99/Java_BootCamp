package sec_verify04;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		for (int i = 0; i < 5; i++) {
			int problemlocation = car.run();
			if (problemlocation == 2) {
				System.out.println(car.tires[problemlocation - 1].location + " KumhoTire로 교체");
				car.tires[problemlocation - 1] = new KumhoTire(car.tires[problemlocation - 1].location, 13);
			} else if (problemlocation == 3) {
				System.out.println(car.tires[problemlocation - 1].location + " HanKookTire로 교체");
				car.tires[problemlocation - 1] = new HankookTire(car.tires[problemlocation - 1].location, 14);
			} else if (problemlocation == 1) {
				System.out.println(car.tires[problemlocation - 1].location + " HanKookTire로 교체");
				car.tires[problemlocation - 1] = new HankookTire(car.tires[problemlocation - 1].location, 14);
			} else if (problemlocation == 4) {
				System.out.println(car.tires[problemlocation - 1].location + " KumhoTire로 교체");
				car.tires[problemlocation - 1] = new KumhoTire(car.tires[problemlocation - 1].location, 13);
			}
			System.out.println("--------------------------------");
		}

	}

}
