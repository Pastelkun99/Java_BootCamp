package sec02_hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class KeyExample {

	public static void main(String[] args) {
		
		//HashMap�� ��� Key�� �����͸� �����ϴ� �÷���
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(2), "ȫ�浿");
		
		/*HashMap, HashSet, Hashtable, LinkedHashSet(�÷��� (List�迭, treeset����))��
		equals�� ȣ���ϱ� ���� hashcode()�� ���� ȣ���Ѵ�.
		�׷��� ������, new�� ���� Key�ν������� ��������Ƿ�, ���� �տ� ����Ǵ� ������
		�޸� ���ϴ� ���� ���� �ƴ��Ѵ�.
		���ϴ� ���� ��� ���ؼ��� ObjectŬ������ hashcode()�� ������ �ؼ� ���� ������
		1�� ������ ������ �����Ѵ�.
		�׸��� equals()�� �������Ͽ� �� ���� ���� �����ν� ���ü�� �Ǿ� ���ϴ� ���� ���´�.*/
		//hash�ø���鿡�� ������������ �����ޱ����ؼ��� �������̵��� ���� �� �ʿ䰡 �ִ�.
		
		String value = hashMap.get(new Key(2));
		
		String value1 = new String("ȫ�浿");
		String value2 = new String("ȫ�浿");
		System.out.println(value);
		System.out.println(value1.hashCode() + " " + value2.hashCode());
		
		List<Key> list = new ArrayList<Key>();
		list.add(new Key(10));
		list = new LinkedList<Key>();
		list.add(new Key(10));
		Set<Key> set = new LinkedHashSet<Key>();
		set.add(new Key(10));
	}
}