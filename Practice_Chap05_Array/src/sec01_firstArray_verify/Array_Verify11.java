package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify11 {

	public static void main(String[] args) {

		String[] string = { "", "����", "����", "��" };
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("����, ����, ���� �Է��ϼ���.");
		System.out.println("�����Ͻ÷��� �׸��� �Է��ϼ���.");

		String user, computer;

		while (true) {
			System.out.print("�Է� : ");
			user = scanner.nextLine();
			computer = string[(int) (Math.random() * 3 + 1)];
			if (user.equals("����")) {
				if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " �����ϴ�.");
				}
				if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
				if (computer.equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ����ڰ� �̰���ϴ�.");
				}
			} else if (user.equals("����")) {
				if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ����ڰ� �̰���ϴ�.");
				}
				if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " �����ϴ�.");
				}
				if (computer.equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
			} else if (user.equals("��")) {
				if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
				if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ����ڰ� �̰���ϴ�.");
				}
				if (computer.equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " �����ϴ�.");
				}
			} else if (user.equals("�׸�")) {
				System.out.println("������ �׸��Ӵϴ�.");
				break;
			} else {
				System.out.println("�ùٸ� �Է°��� �Է����ֽʽÿ�.");
			}

		}

	}

}
