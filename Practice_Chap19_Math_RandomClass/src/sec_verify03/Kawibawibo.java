package sec_verify03;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		
		final String[] str = {"", "����", "����", "��"};
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int userChoice;
		int computerChoice;
		
		while(true) {
		System.out.print("����(1), ����(2), ��(3), ������(4) �� �ϳ��� �����ϼ���! >> ");
		userChoice = scanner.nextInt();
		computerChoice = (int)(Math.random()*3+1);
		
		if(userChoice == 1) {
			
			if(computerChoice == 1) {
				System.out.println("��ǻ�ʹ� " + str[1] + "�� �½��ϴ�.");
				System.out.println("�����ϴ�.");
				}
			if(computerChoice == 2) {
				System.out.println("��ǻ�ʹ� " + str[2] + "�� �½��ϴ�.");
				System.out.println("����� �����ϴ�.");
			}
			if(computerChoice == 3) {
				System.out.println("��ǻ�ʹ� " + str[3] + "�� �½��ϴ�.");
				System.out.println("����� �̰���ϴ�.");
			}
		}
		
		if(userChoice == 2) {
			
			if(computerChoice == 1) {
				System.out.println("��ǻ�ʹ� " + str[1] + "�� �½��ϴ�.");
				System.out.println("����� �̰���ϴ�.");
				}
			if(computerChoice == 2) {
				System.out.println("��ǻ�ʹ� " + str[2] + "�� �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
			if(computerChoice == 3) {
				System.out.println("��ǻ�ʹ� " + str[3] + "�� �½��ϴ�.");
				System.out.println("����� �����ϴ�.");
			}
		}

		if(userChoice == 3) {
			
			if(computerChoice == 1) {
				System.out.println("��ǻ�ʹ� " + str[1] + "�� �½��ϴ�.");
				System.out.println("����� �����ϴ�.");
				}
			if(computerChoice == 2) {
				System.out.println("��ǻ�ʹ� " + str[2] + "�� �½��ϴ�.");
				System.out.println("����� �̰���ϴ�.");
			}
			if(computerChoice == 3) {
				System.out.println("��ǻ�ʹ� " + str[3] + "�� �½��ϴ�.");
				System.out.println("�����ϴ�.");
			}
		}
		
		if(userChoice == 4) {
			System.out.println("���� ����");
			System.exit(0);
		}
		
	}
		
	}
}
