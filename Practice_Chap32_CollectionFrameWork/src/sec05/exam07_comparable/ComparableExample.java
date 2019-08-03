package sec05.exam07_comparable;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//Person�̶�� ����� ���� Ŭ������ �����ϴ� TreeSet�� ����.
		//Age�� ���� ������������ ������ �Ǿ��ִ�.
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// PersonŬ������ Comparable�������̽��� �����Ͽ��� ������,
		// Age�� ���� ������������ ������ �Ǿ� �ִ�.
		treeSet.add(new Person("������", 9));
		treeSet.add(new Person("ȫ�浿", 35));
		treeSet.add(new Person("�տ���", 19));
		treeSet.add(new Person("����", 19));
		treeSet.add(new Person("�ڿ���", 25));
		treeSet.add(new Person("������", 21));
		treeSet.add(new Person("�չμ�", 29));
		treeSet.add(new Person("������", 51));
		treeSet.add(new Person("�ڱ���", 61));
		
		
		// ������������ ���ĵ� ���� �Ʒ��� ���� Ȯ�� �����ϴ�.
		// (�ݺ��ڸ� �� �� �� ����غ���.)
		// �׷���, ���� ���̶��, �ߺ� ���� ���� �ʴ´�.
		System.out.println("�� ��ü �� : " + treeSet.size());
		/*for(Person person : treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("�̸� : " + str + " ���� : " + age);
		}*/
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person s = it.next();
			System.out.println("�̸� : " + s.getName() + " ���� : " + s.getAge());
		}
		
		/*while(it.hasNext()) {
			System.out.println(it.next().toString());
		}*/
		
		// �������� ����
		/*NavigableSet<Person> desending = treeSet.descendingSet();
		Iterator<Person> descit = desending.iterator();
		while(descit.hasNext()) {
			Person p = descit.next();
			System.out.println("�̸� : " + p.getName() + " ���� : " + p.getAge());
		}*/
	}
}