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
		
		map.put("신은혁", 96);
		map.put("김주성", 86);
		map.put("김연안", 92);
		map.put("김기리", 88);
		map.put("안홍범", 90);
		map.put("박주영", 44);
		map.put("안정환", 55);
		map.put("박성식", 2);
		map.put("윤두호", 9);
		map.put("엄기홍", 12);
		
		Set<String> set = map.keySet();
		
		Collection<Integer> values = map.values();
		
		Iterator<Integer> it = values.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Integer i = it.next();
			sum += i.intValue();
		}
		
		System.out.println("총합 학생 수 : " + map.size());
		System.out.println("평균 점수 : " + sum/set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최고 점수를 받은 아이디 : " + getkey(map, Collections.max(values)));
		System.out.println("최저 점수 : " + Collections.min(values));
		System.out.println("최저 점수를 받은 아이디 : " + getkey(map, Collections.min(values)));
		
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


