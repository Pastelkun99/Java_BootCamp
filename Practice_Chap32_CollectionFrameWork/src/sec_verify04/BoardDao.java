package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
			
	public List<Board> getBoardList() {
		
		List<Board> box = new ArrayList<>();
		Board b1 = new Board("�̰��� �ڹٴ�", "�ſ��");
		Board b2 = new Board("�ڹ��� ����", "���ü�");
		Board b3 = new Board("��ǰ �ڹ����α׷���", "Ȳ����");
		
		box.add(b1);
		box.add(b2);
		box.add(b3);
		
		System.out.println("���� list�� ����Ǿ��ִ� Board ��ü �Դϴ�.");
		System.out.println(b1.getTitle() + " : " + b1.getContent());
		System.out.println(b2.getTitle() + " : " + b2.getContent());
		System.out.println(b3.getTitle() + " : " + b3.getContent());
		return null;
	}
}
