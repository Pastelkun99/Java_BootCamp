package sec_verify02;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		System.out.print("1차원 배열을 만듭니다. 배열 수를 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		System.out.println("해당 배열 방의 정수를 입력하세요. : ");
		int[] values = new int[input];
		int num;
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("values[" + i + "] = ");
			num = scanner.nextInt();
			values[i] = num;
		}
		
		System.out.println("Computer 인스턴스 멤버메서드 sum을 호출한 결과는 " + com.sum(values) + "입니다.");
		scanner.close();
	}

}
