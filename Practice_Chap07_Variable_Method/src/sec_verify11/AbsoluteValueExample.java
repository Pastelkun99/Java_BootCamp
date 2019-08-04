package sec_verify11;

import java.util.Scanner;

public class AbsoluteValueExample {

	public static void main(String[] args) {

		AbsoluteValue absolute = new AbsoluteValue();

		Scanner scan = new Scanner(System.in);
		System.out.println("절댓값을 구하고자 하는 정수 입력 : ");
		int input1 = scan.nextInt();
		absolute.abs(input1);

		System.out.println("절댓값을 구하고자 하는 정수 입력 : ");
		int input2 = scan.nextInt();
		absolute.abs(input2);

		scan.close();
	}

}
