package sec01_verify;

import java.util.Scanner;

public class Exercise05_If {

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

		if (position == 1) {
			System.out.println("�������� 1000����/�� �Դϴ�.");
		} else if (position == 2) {
			System.out.println("���������� 800����/�� �Դϴ�.");
		} else if (position == 3) {
			System.out.println("���������� 600����/�� �Դϴ�.");
		} else if (position == 4) {
			System.out.println("���������� 400����/�� �Դϴ�.");
		} else if (position == 5) {
			System.out.println("�븮������ 250����/�� �Դϴ�.");
		} else if (position == 6) {
			System.out.println("��������� 180����/�� �Դϴ�.");
		}

	}

}
