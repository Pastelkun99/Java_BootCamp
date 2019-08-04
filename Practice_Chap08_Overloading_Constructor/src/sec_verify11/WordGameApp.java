package sec_verify11;

import java.util.Scanner;

public class WordGameApp {

	private Scanner scanner; // Ű���� �Է�
	private String startWord = "�ƹ���"; // ���� �ܾ�
	private Player[] players; // ���� �����ڵ�

	public WordGameApp() {
		scanner = new Scanner(System.in);
	}

	public void createPlayers() {
		System.out.print("���ӿ� �����ϴ� �ο��� �� ���Դϱ�? >> ");
		int person = scanner.nextInt();
		players = new Player[person]; // player[] ��ü �迭 ����

		// �� �������� �̸��� �Է¹޾� Player��ü�� �����ϰ� attach�۾�
		for (int i = 0; i < person; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >> ");
			String name = scanner.next();
			players[i] = new Player(name);
		}
	}

	// ������ �����ϴ� �޼ҵ�
	public void run() {
		createPlayers(); // �����ڸ� ���� Player[]�� ����
		String lastword = startWord; // startword���� ����

		System.out.println("�����ϴ� �ܾ�� " + lastword + "�Դϴ�.");
		int next = 0; // �����ڵ��� ������� ����

		// ������ ���� �� ���� ����
		while (true) {
			String newWord = players[next].sayWord();

			// next �����ڰ� �����Ͽ����� �˻�.
			if (!players[next].succeed(lastword)) {
				System.out.print(players[next].getName() + "�� �����ϴ�.");
				break;
			}
			next++;
			next %= players.length;
			lastword = newWord;
		}
	}
}
