package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WorldCountExample {

	public static void main(String[] args) {
		
		System.out.println("������ �Է��ϼ���. �Է��Ͻ� ������ �� �������� �и��Ǿ� ��µ˴ϴ�.");
		System.out.println("���Ḧ ���Ͻø� exit�� �Է��Ͻø� �˴ϴ�.");
		
		while(true) {
		System.out.print("�Է� : ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		if(input.equals("exit")) {
			System.out.println("�����մϴ�...");
			System.exit(0);
		}
		else {
			StringTokenizer st = new StringTokenizer(input, " ");
			
			System.out.println("������ ������ : " + st.countTokens());
			
			int i = 1;
			
			while(st.hasMoreTokens()) {
				String str = st.nextToken();
				System.out.println("�и��� " + i + "��° ���� : " + str);
				i++;
			}
		}
	}
		
	}
}
