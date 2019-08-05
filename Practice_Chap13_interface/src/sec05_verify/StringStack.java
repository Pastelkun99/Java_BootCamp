package sec05_verify;

import java.util.Scanner;

public class StringStack implements Stack {

	private String[] arr;
	private int num;

	public StringStack(int num) {
		this.num = num;
	}

	@Override
	public int length() {
		System.out.println(num + "개의 스택영역이 생성되었습니다.");
		arr = new String[num];
		return num;
	}

	@Override
	public Object pop() {
		System.out.println("스택은 후입선출 개념입니다. (LIFO)");
		System.out.println("스택에 있는 문장들을 출력합니다.");
		System.out.println();

		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "번째 스택에 저장된 문장을 출력합니다.");
			System.out.println(arr[num - i - 1]);
		}
		return null;
	}

	@Override
	public void push(Object o) {
		for (int i = 0; i < num; i++) {
			System.out.print("저장하고 싶은 문장을 입력하세요 : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			arr[i] = input;
			System.out.println(input + " 가 스택에 저장되었습니다.");
			System.out.println(input + " 문장이 " + (i + 1) + "번째 스택에 저장되었습니다.");
			System.out.println();
		}

	}

}
