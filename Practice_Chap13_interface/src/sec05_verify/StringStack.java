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
		System.out.println(num + "���� ���ÿ����� �����Ǿ����ϴ�.");
		arr = new String[num];
		return num;
	}

	@Override
	public Object pop() {
		System.out.println("������ ���Լ��� �����Դϴ�. (LIFO)");
		System.out.println("���ÿ� �ִ� ������� ����մϴ�.");
		System.out.println();

		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "��° ���ÿ� ����� ������ ����մϴ�.");
			System.out.println(arr[num - i - 1]);
		}
		return null;
	}

	@Override
	public void push(Object o) {
		for (int i = 0; i < num; i++) {
			System.out.print("�����ϰ� ���� ������ �Է��ϼ��� : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			arr[i] = input;
			System.out.println(input + " �� ���ÿ� ����Ǿ����ϴ�.");
			System.out.println(input + " ������ " + (i + 1) + "��° ���ÿ� ����Ǿ����ϴ�.");
			System.out.println();
		}

	}

}
