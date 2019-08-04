package sec_verify11;

import java.util.Scanner;

public class WordGameApp {

	private Scanner scanner; // 키보드 입력
	private String startWord = "아버지"; // 시작 단어
	private Player[] players; // 게임 참가자들

	public WordGameApp() {
		scanner = new Scanner(System.in);
	}

	public void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇 명입니까? >> ");
		int person = scanner.nextInt();
		players = new Player[person]; // player[] 객체 배열 생성

		// 각 참여자의 이름을 입력받아 Player객체를 생성하고 attach작업
		for (int i = 0; i < person; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			String name = scanner.next();
			players[i] = new Player(name);
		}
	}

	// 게임을 진행하는 메소드
	public void run() {
		createPlayers(); // 참가자를 위한 Player[]를 생성
		String lastword = startWord; // startword에서 시작

		System.out.println("시작하는 단어는 " + lastword + "입니다.");
		int next = 0; // 참가자들의 순서대로 증가

		// 게임이 끝날 때 까지 루프
		while (true) {
			String newWord = players[next].sayWord();

			// next 참가자가 성공하였는지 검사.
			if (!players[next].succeed(lastword)) {
				System.out.print(players[next].getName() + "이 졌습니다.");
				break;
			}
			next++;
			next %= players.length;
			lastword = newWord;
		}
	}
}
