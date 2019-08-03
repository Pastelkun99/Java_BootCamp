package sec05.exam04_treemap_method;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		// Ű�� Integer, ������ String Ÿ���� ���
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		// map��ü 5���� �������� ����������, treemap�� ����Ʈ���� ���ؼ�
		// �ڵ� ������ �ȴ�.
		// scores.put(87, "ȫ�浿"); �̷��� �ۼ��ص� �Ǵ� ���� �˰��ִ�.
		scores.put(new Integer(87), "ȫ�浿");
		scores.put(new Integer(98), "������");
		scores.put(new Integer(75), "�迬��");
		scores.put(new Integer(95), "�տ���");
		scores.put(new Integer(80), "����");
		
		Map.Entry<Integer, String> entry = null;
		// ����Ʈ�� �� ���� ���� ��, Ű�� ���� ���� ���� ���� �����´�.
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + " - " + entry.getValue());
		System.out.println();
		
		// ����Ʈ�� �� ���� ������ ��, Ű�� ���� ���� ���� ���� �����´�.
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + " - " + entry.getValue());
		System.out.println();
		
		// ����Ʈ�� �� �־��� ��ü ��, 95�� ���� ���� Entry�� �����Ѵ�. (95�� ������)
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �ٷ� �Ʒ� ���� (95 ������) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println();
		
		// ����Ʈ�� �� �־��� ��ü ��, 95�� ���� ���� Entry�� �����Ѵ�. (95�� ������)
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� �ٷ� �� ���� (95 ������) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println();
		
		// ����Ʈ�� �� �־��� ��ü ��, 95������ ���� Entry�� �����Ѵ�. (95�� ����)
		entry = scores.floorEntry(new Integer(95));
		// entry = scores.floorEntry(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� (95 ����) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println();
		
		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �� ���� (95 ����) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println();
		
		while(!scores.isEmpty()) {
			// ���� treeset�� �����ϰ� pollFirstEntry()�� treemap���� ���� ���� ���� entry�� �������� map���� ������.
			// ��������
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : " + value + " - �� : " + str + " (�����ִ� ��ü �� : " + scores.size() + ")");
		}
		
		/*while(!scores.isEmpty()) {
			// ���� treeset�� �����ϰ� pollLastEntry()�� treemap���� ���� ���� ���� entry�� �������� map���� ������.
			// ��������
			entry = scores.pollLastEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : " + value + "�� : " + str + "(�����ִ� ��ü �� : " + scores.size() + ")");
		}*/
		
		// treemap�� ���� keySet�� �ް�, �ݺ��ڸ� ���� �� ��ü��ü�� ����غ�
		// ���� ���̰� �ִ� ����, �ݺ��ڸ� ���� ��� ����ϴ� ���� treemap���� 
		// ��ü�� ���Ű� �ȵ��� �˵��� ����.
		/*Set<Integer> keyset = scores.keySet();
		Iterator<Integer> iterator = keyset.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			// ��������� ȣ�������ν� treemap���� ������ ���� �ִ�.
			// iterator.remove();
			System.out.println("Ű : " + value + "�� : " + str + "(�����ִ� ��ü �� : " + scores.size() + ")");
		}*/
		
		// treemap�� ���� keySet�� �ް�, �ݺ��ڸ� ���� �� ��ü��ü�� ����غ�
		// ���� ���̰� �ִ� ����, �ݺ��ڸ� ���� ��� ����ϴ� ���� treemap���� 
		// ��ü�� ���Ű� �ȵ��� �˵��� ����.
		
		/*Set<Map.Entry<Integer, String>> entryset = scores.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entryset.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> mapentry = iterator.next();
			int value = mapentry.getKey();
			String str = mapentry.getValue();
			// iterator.remove(); ����� ȣ�� ���� ����
			System.out.println("Ű : " + value + "�� : " + str + "(�����ִ� ��ü �� : " + scores.size() + ")");
		}*/
		
	}
}
