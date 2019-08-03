package sec_verify10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		int size = set.size();
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		
		Iterator<String> it = set.iterator();
		int num = 1;
		while(it.hasNext()) {	
			String ele = it.next();
			System.out.println(num + "¹øÂ° °´Ã¼ : " + ele);
			num++;
		}
		
		
	}
}
