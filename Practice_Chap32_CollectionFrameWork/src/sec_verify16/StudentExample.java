package sec_verify16;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentExample {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<Student>();
		
		treeSet.add(new Student("������", 96));
		treeSet.add(new Student("���ּ�", 86));
		treeSet.add(new Student("�赿��", 68));
		treeSet.add(new Student("�̴�ȣ", 100));
		treeSet.add(new Student("��ȣ��", 59));
		treeSet.add(new Student("������", 77));
		
		
		System.out.println("��ü �л� ����Ʈ�Դϴ�.");
		System.out.println();
		
		Iterator<Student> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		Integer score = null;
		String name = null;
		score = treeSet.last().getScore();
		name = treeSet.last().getName();
		
		System.out.println();
		System.out.println("�ְ� ���� : " + score + " �л� �̸� : " + name);
	}
}
