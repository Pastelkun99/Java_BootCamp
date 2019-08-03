package sec_verify03;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		
		final String[] str = {"", "가위", "바위", "보"};
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int userChoice;
		int computerChoice;
		
		while(true) {
		System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요! >> ");
		userChoice = scanner.nextInt();
		computerChoice = (int)(Math.random()*3+1);
		
		if(userChoice == 1) {
			
			if(computerChoice == 1) {
				System.out.println("컴퓨터는 " + str[1] + "를 냈습니다.");
				System.out.println("비겼습니다.");
				}
			if(computerChoice == 2) {
				System.out.println("컴퓨터는 " + str[2] + "를 냈습니다.");
				System.out.println("당신이 졌습니다.");
			}
			if(computerChoice == 3) {
				System.out.println("컴퓨터는 " + str[3] + "를 냈습니다.");
				System.out.println("당신이 이겼습니다.");
			}
		}
		
		if(userChoice == 2) {
			
			if(computerChoice == 1) {
				System.out.println("컴퓨터는 " + str[1] + "를 냈습니다.");
				System.out.println("당신이 이겼습니다.");
				}
			if(computerChoice == 2) {
				System.out.println("컴퓨터는 " + str[2] + "를 냈습니다.");
				System.out.println("비겼습니다.");
			}
			if(computerChoice == 3) {
				System.out.println("컴퓨터는 " + str[3] + "를 냈습니다.");
				System.out.println("당신이 졌습니다.");
			}
		}

		if(userChoice == 3) {
			
			if(computerChoice == 1) {
				System.out.println("컴퓨터는 " + str[1] + "를 냈습니다.");
				System.out.println("당신이 졌습니다.");
				}
			if(computerChoice == 2) {
				System.out.println("컴퓨터는 " + str[2] + "를 냈습니다.");
				System.out.println("당신이 이겼습니다.");
			}
			if(computerChoice == 3) {
				System.out.println("컴퓨터는 " + str[3] + "를 냈습니다.");
				System.out.println("비겼습니다.");
			}
		}
		
		if(userChoice == 4) {
			System.out.println("게임 종료");
			System.exit(0);
		}
		
	}
		
	}
}
