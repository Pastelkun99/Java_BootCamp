package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	public static Queue<String> q = new LinkedList<>();
	
	public static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
		System.out.print(">> ");
		String input = scanner.nextLine();
		
		switch(input) {
		case "help" :
			System.out.println("help - 도움말을 출력합니다.");
			System.out.println("q 또는 Q - 프로그램을 종료합니다.");
			System.out.println("history - 최근에 입력한 명령어 5개를 보여줍니다.");
			break;
		case "history" :
			for(int i = 0; i<MAX_SIZE; i++) {
				System.out.println((i+1) + ". " + q.poll());
			}
			break;
		case "q" :
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		case "Q" :
			System.out.println("프로그램을 종료합니다.");
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
		

