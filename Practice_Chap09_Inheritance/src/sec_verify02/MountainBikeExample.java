package sec_verify02;

import java.util.Scanner;

public class MountainBikeExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�� �����Ŵ� ��ǥ(�귣��)�� : ");
			String brand = scanner.next();
			@SuppressWarnings("unused")
			MountainBike mon = new MountainBike(0, brand);
		}
		scanner.close();
	}

}
