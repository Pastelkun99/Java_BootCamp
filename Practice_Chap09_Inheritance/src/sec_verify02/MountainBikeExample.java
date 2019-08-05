package sec_verify02;

import java.util.Scanner;

public class MountainBikeExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("내 자전거는 상표(브랜드)가 : ");
			String brand = scanner.next();
			@SuppressWarnings("unused")
			MountainBike mon = new MountainBike(0, brand);
		}
		scanner.close();
	}

}
