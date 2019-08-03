package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		System.out.print("초를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int time = Integer.parseInt(input);
		scanner.close();
		
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = time / 3600;
		
		System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초입니다.");
		
	}

}
