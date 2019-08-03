package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify11 {

	public static void main(String[] args) {

		String[] string = { "", "가위", "바위", "보" };
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위, 바위, 보를 입력하세요.");
		System.out.println("종료하시려면 그만을 입력하세요.");

		String user, computer;

		while (true) {
			System.out.print("입력 : ");
			user = scanner.nextLine();
			computer = string[(int) (Math.random() * 3 + 1)];
			if (user.equals("가위")) {
				if (computer.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 비겼습니다.");
				}
				if (computer.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 컴퓨터가 이겼습니다.");
				}
				if (computer.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 사용자가 이겼습니다.");
				}
			} else if (user.equals("바위")) {
				if (computer.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 사용자가 이겼습니다.");
				}
				if (computer.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 비겼습니다.");
				}
				if (computer.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 컴퓨터가 이겼습니다.");
				}
			} else if (user.equals("보")) {
				if (computer.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 컴퓨터가 이겼습니다.");
				}
				if (computer.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 사용자가 이겼습니다.");
				}
				if (computer.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 비겼습니다.");
				}
			} else if (user.equals("그만")) {
				System.out.println("게임을 그만둡니다.");
				break;
			} else {
				System.out.println("올바른 입력값을 입력해주십시오.");
			}

		}

	}

}
