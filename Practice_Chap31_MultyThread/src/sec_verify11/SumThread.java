package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		int sum = 0;
		int first = 0;
		int second = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ������ ������ ���� ���մϴ�.");
		System.out.print("ù ��° ���� : ");
		first = scan.nextInt();
		System.out.print("�� ��° ���� : ");
		second = scan.nextInt();
		
		for(int i = first; i<=second; i++) {
			sum += i;
		}
		
		return sum;
	}

}
