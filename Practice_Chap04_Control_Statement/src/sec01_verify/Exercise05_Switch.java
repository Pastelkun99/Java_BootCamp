package sec01_verify;

import java.util.Scanner;

public class Exercise05_Switch {

	public static void main(String[] args) {

		System.out.println("������ �Ʒ��� �����ϴ�.");
		System.out.println("1. ��");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. �븮");
		System.out.println("6. ���\n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("�˰���� ���� �� �ش������� �Է��ϼ��� : ");
		int position = scanner.nextInt();
		scanner.close();

		switch (position) {
		case 1:
			System.out.print("�������� 1000����/�� �Դϴ�.");
			break;
		case 2:
			System.out.print("���������� 800����/�� �Դϴ�.");
			break;
		case 3:
			System.out.print("���������� 600����/�� �Դϴ�.");
			break;
		case 4:
			System.out.print("���������� 400����/�� �Դϴ�.");
			break;
		case 5:
			System.out.print("�븮������ 250����/�� �Դϴ�.");
			break;
		case 6:
			System.out.print("��������� 180����/�� �Դϴ�.");
			break;
		}

	}

}
