package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	public static Queue<String> q = new LinkedList<>();
	
	public static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
		System.out.print(">> ");
		String input = scanner.nextLine();
		
		switch(input) {
		case "help" :
			System.out.println("help - ������ ����մϴ�.");
			System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�.");
			System.out.println("history - �ֱٿ� �Է��� ��ɾ� 5���� �����ݴϴ�.");
			break;
		case "history" :
			for(int i = 0; i<MAX_SIZE; i++) {
				System.out.println((i+1) + ". " + q.poll());
			}
			break;
		case "q" :
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		case "Q" :
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default :
			q.add(input);
			System.out.println(input);
			break;
		}
		}
	}
}
		

