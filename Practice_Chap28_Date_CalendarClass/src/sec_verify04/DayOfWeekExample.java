package sec_verify04;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeekExample {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		String[] days = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��¥�� yyyy/MM/dd �� ���·� �Է����ּ���. (�� : 2016/01/01)");
		
		while(true) {
		try {
		System.out.print(">> ");
		String input = "";
		input = scanner.nextLine();
		
		String[] inputcon = input.split("/");
		
		cal.set(Integer.parseInt(inputcon[0]), Integer.parseInt(inputcon[1])-1, Integer.parseInt(inputcon[2]));
		
		if(Integer.parseInt(inputcon[1])-1 > 12 || Integer.parseInt(inputcon[2]) > 31) {
			throw new Exception();
		}
		else {
			System.out.println("�Է��Ͻ� ��¥�� " + days[cal.get(Calendar.DAY_OF_WEEK)-1] + "�Դϴ�.");
		}
		scanner.close();
		break;
		} catch (Exception e) {
			System.out.println("���� �߻� -> ��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է� �� : 2016/01/01)");
		}
	}
	}
}
