package sec01_verify;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {

		System.out.println("M, m ����, A, a ����, E, e ����");
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� : ");
		String sel = scanner.nextLine();
		scanner.close();

		switch (sel) {
		case "M":
		case "m":
			System.out.println("�����̳�~");
			break;
		case "A":
		case "a":
			System.out.println("���ĳ�~");
			break;
		case "E":
		case "e":
			System.out.println("�����̳�~");
			break;
		default:
			System.out.println("�߸� �Է��߳�~");
		}

	}

}
