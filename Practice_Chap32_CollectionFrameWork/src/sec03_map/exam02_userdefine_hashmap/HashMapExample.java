package sec03_map.exam02_userdefine_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Ű�� Student(����� ���� ��ü) ������ Integer�� ���
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		// �Ʒ� �� ���� Map.entry�� ���ü�� �ȴ�. Ű�� ���� Student��ü�� sno��,
		// name�� ���� ����. �Ͽ� �������� ����� ������ ��ü�ȴ�.
		// ������, HashCode()�� equals()�� ������ ���� �ʾҴٸ�, �ٸ� ��ü�� �νĵǾ� ����ȴ�.
		// �ֳ��ϸ� new�� ���ο� ��ü�� ����� ���̴�.
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 90);
		map.put(new Student(2, "������"), 100);
		map.put(new Student(2, "���ּ�"), 58);
		
		System.out.println("�� Entry �� : " + map.size());
		System.out.println("ȫ�浿 : " + map.get(new Student(1, "ȫ�浿")));
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keySetIterator = keySet.iterator(); 	//�ݺ��� ��
		
		while(keySetIterator.hasNext()) {
			Student key = keySetIterator.next();
			System.out.println("Student(sno) : " + key.getSno() + ", " + "Student(name) : " + key.getName()
								+ " " + "Integer : " + map.get(new Student(key.getSno(), key.getName())));
		}
		
		// MapEntry�� ���� �ڵ��غ���.
		//Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		//Iterator<Map.Entry<Student, Integer>> enteySetIterator = entrySet.iterator();
	}
}
