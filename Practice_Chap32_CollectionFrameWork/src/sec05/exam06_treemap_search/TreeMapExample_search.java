package sec05.exam06_treemap_search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_search {

	public static void main(String[] args) {
		
		// Ű�� String, ���� Integer�� TreeMap�÷����� ������.
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		//Map.Entry��ü�� 10���� �������� ����������, ����ɶ��� ����Ʈ�� ��������
		// ���ĺ��� �����ڵ忡 ���� �ڵ� ������ �̷������.
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("f", new Integer(64));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(100));
		treeMap.put("guess", new Integer(80));
		treeMap.put("banana", new Integer(90));
		treeMap.put("kdb", new Integer(80));
		treeMap.put("lherry", new Integer(15));
		
		System.out.println("[c ~ f] ������ �ܾ� �˻�");
		// c~f ������ Map.Entry��ü(Ű��)�� �������� subMap�� �̿��Ѵ�.
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		//�ٽ� rangeMap�� entrySet�� ��� ����غ���.
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for( Map.Entry<String, Integer> entry : entrySet ) {
			String str = entry.getKey();
			int value = entry.getValue(); 
			System.out.println("�ܾ� : " + str + " - " + "������ : " + value);
		}
		System.out.println();
		
		// "k"�� �����ϰ� ���� ���鸸 ������ Map.Entry��ü�� �����Ѵ�.
		System.out.println("[k ���� ���� �ܾ� �˻�]");
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("k", true);
		for( Map.Entry<String, Integer> entry : tailMap.entrySet() ) {
			String str = entry.getKey();
			int value = entry.getValue(); 
			System.out.println("�ܾ� : " + str + " - " + "������ : " + value);
		}
		System.out.println();
				
		// "g"�� �����ϰ� �� ������ ���鸸 ������ Map.Entry��ü�� �����Ѵ�.
		System.out.println("[g ���� ���� �ܾ� �˻�]");
		NavigableMap<String, Integer> headMap = treeMap.headMap("g", true);
		for( Map.Entry<String, Integer> entry : headMap.entrySet() ) {
			String str = entry.getKey();
			int value = entry.getValue(); 
			System.out.println("�ܾ� : " + str + " - " + "������ : " + value);
		}
		System.out.println();
	}
}
