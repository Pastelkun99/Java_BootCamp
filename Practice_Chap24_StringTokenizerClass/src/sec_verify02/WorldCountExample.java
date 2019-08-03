package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WorldCountExample {

	public static void main(String[] args) {
		
		System.out.println("문장을 입력하세요. 입력하신 문장은 한 공백으로 분리되어 출력됩니다.");
		System.out.println("종료를 원하시면 exit를 입력하시면 됩니다.");
		
		while(true) {
		System.out.print("입력 : ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		if(input.equals("exit")) {
			System.out.println("종료합니다...");
			System.exit(0);
		}
		else {
			StringTokenizer st = new StringTokenizer(input, " ");
			
			System.out.println("낱말의 개수는 : " + st.countTokens());
			
			int i = 1;
			
			while(st.hasMoreTokens()) {
				String str = st.nextToken();
				System.out.println("분리된 " + i + "번째 낱말 : " + str);
				i++;
			}
		}
	}
		
	}
}
