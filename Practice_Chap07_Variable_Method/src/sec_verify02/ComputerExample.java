package sec_verify02;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

		Computer com = new Computer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1차원 배열을 만듭니다.");
		System.out.print("해당 배열의 원소 수를 입력하세요. : ");
		int input = scanner.nextInt();
		int[] values = new int[input];
		int num;

		for (int i = 0; i < values.length; i++) {
			System.out.print("values[" + i + "] = ");
			num = scanner.nextInt();
			values[i] = num;
		}
		
		System.out.println("입력하신 1차원 배열의 값을 출력합니다.");
		for(int j = 0; j<values.length; j++) {
			System.out.println("values["+j+"] = " + values[j]);
		}

		System.out.println("Computer 인스턴스 멤버메서드 sum을 호출한 결과는 " + com.sum(values) + "입니다.");
		scanner.close();
	}

}
