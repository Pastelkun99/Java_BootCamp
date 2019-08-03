package sec_verify13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("������", 96);
		map.put("���ּ�", 86);
		map.put("�迬��", 92);
		map.put("��⸮", 88);
		map.put("��ȫ��", 90);
		map.put("���ֿ�", 44);
		map.put("����ȯ", 55);
		map.put("�ڼ���", 2);
		map.put("����ȣ", 9);
		map.put("����ȫ", 12);
		
		Set<String> set = map.keySet();
		
		Collection<Integer> values = map.values();
		
		Iterator<Integer> it = values.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Integer i = it.next();
			sum += i.intValue();
		}
		
		System.out.println("���� �л� �� : " + map.size());
		System.out.println("��� ���� : " + sum/set.size());
		System.out.println("�ְ� ���� : " + Collections.max(values));
		System.out.println("�ְ� ������ ���� ���̵� : " + getkey(map, Collections.max(values)));
		System.out.println("���� ���� : " + Collections.min(values));
		System.out.println("���� ������ ���� ���̵� : " + getkey(map, Collections.min(values)));
		
	}
	
	public static Object getkey(Map<String, Integer> map, Object value) {
		for(Object o : map.keySet()) {
			if(map.get(o).equals(value)) {
				return o;
			}
		} 
		return null;
	}
}


