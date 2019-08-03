package sec01_list.exam02_Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// ����Ǵ� ��ü�� ����� ���� Ÿ���� Board�� �ȴ�.
		
		Vector<Board> list = new Vector<Board>();
		
		// ��ü �߰�
		list.add(new Board("����1", "����1", "�۾���1")); //0
		list.add(new Board("����2", "����2", "�۾���2")); //1
		list.add(new Board("����3", "����3", "�۾���3")); //2
		list.add(new Board("����4", "����4", "�۾���4")); //3
		list.add(new Board("����5", "����5", "�۾���5")); //4
		
		list.remove(2);
		list.remove(3);
		//list.setSize(15); setsize�� ȣ��Ǹ鼭 ������ capacity�� 2��� �ø���, size�� 15�� ������
		
		//�ݺ���
		Iterator<Board> it = list.iterator();
		
		while(it.hasNext()) {
			Board board = it.next();
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		/*for(Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}*/
		
	}
}