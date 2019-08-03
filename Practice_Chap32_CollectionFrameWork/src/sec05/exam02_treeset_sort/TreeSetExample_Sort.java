package sec05.exam02_treeset_sort;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Sort {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		// ����ɶ��� �������� ���������, �÷��ǿ� ������ ����Ʈ���� ������ ������ ���� ��������.
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		// TreeSet�� descendingSet()�� ������������ ���ĵ� ��ü���� NavigableSet�� ����ȴ�.
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println("�������� ���");
		
		for(Integer score : descendingSet)
			System.out.println(score + " ");
		System.out.println("\n��ü �� : " + scores.size());
		System.out.println();
		
		// �ٽ� descendingSet()�� ȣ�������ν� �ø��������� �ٲ� ���� �ִ�.
		// pollLast(), pollFirst()�޼��带 �̿��ص� �ȴ�.
		// ���α׷��Ӱ� ��Ȳ�� �°Բ� �����ϸ� �ȴ�.
		NavigableSet<Integer> ascengingSet = descendingSet.descendingSet();
		System.out.println("�ø����� ���");
		for(Integer score : ascengingSet) {
			System.out.println(score + " ");
		}
		System.out.println("\n��ü �� : " + scores.size());
		System.out.println();
	}
}
