package sec01_list.exam01_ArrayList;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		// ArrayList�� ���� ���׸� Ÿ���̴�. �׷��� Warning�� ���.
		// ���� ���ְ� �ʹٸ� Quick Access���� Error�� �Է��ϰ� Preference�� ����
		// Generics�ǿ� �ִ� ���� ��� ignore�� �ٲٸ� �ȴ�.
		
		ArrayList list = new ArrayList(); 		// �⺻������ 10���� ���� ������.
		
		//System.out.println(list.ensureCapacity());
		
		System.out.println("�� ũ�� : " + list.size());
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		
		//add.(new Integer(333));  JDK 1.5���� �߰��� �ڵ��ڽ̱�� �̿�(����Ŭ����)
		list.add(333);
		
		System.out.println("�� ũ�� : " + list.size());
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		// 0 ��° �ε����� ���� ���� ������ ������ ������ �ڷ� �з����� �ȴ�.
		list.add(0, "333");
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		// �տ������� �˻��Ͽ� "333"�� �����Ѵ�. (����� �� �Ѱ��� ����)
		// boolean remove(Object o)
		list.remove("333");
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		System.out.println(list.remove("333"));
		
		//indexOf() �� ����� -1 �̶�� ���� ArrayList�� "333"�� ���ٴ� ���̴�.
		System.out.println("index = " + list.indexOf("333"));
		
		// �⺻������ 10���� ���� �Ѿ�� �Ǵٽ� 10���� ���� �����.
		/*list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		System.out.println("�� ũ�� : " + list.size());*/
		
		// ArrayList�� �� �ε����� �� ����(set(index, Object)�̿�
		for(int i = 0; i<list.size(); i++) {
			list.set(i, i+"");
		}
		
		// ArrayList�� �� �ε����� �� ���(get(index)�̿�)
		System.out.print("{");
		for(int i = 0; i<list.size(); i++) {
			if(i==list.size()-1) 
				System.out.print(list.get(i));
			else
				System.out.print(list.get(i) + ", ");
		}
			System.out.println("}");
			
			//Arraylist�� �� �ε����� �� ���� remove(index)�̿�
			for(int i = 0; i<list.size(); i++) {
				list.remove(i);
			}
			
			//System.out.println(list);
			// �� ������ �������� �ұ��ϰ� 1, 3�� �����ִ�. ���ϱ�?
			// 0�� �����Ҷ��� i�� 0�̴� �翬�� ������ �ȴ�. ������,
			// 0�� ������ ���� �ڿ� ������ �� ������ ����� �ð��̴�.
			// �׸����� �׷����� �� ���ذ� �� ���̴�.
			// ���ذ� �Ǿ����� ArrayList�� �ε����� �ڿ������� ������ �ؾ�
			// ����� ������ ���� �˼��� �ִ�.
			System.out.println(list);
			
			// �Ʒ��� ���� ������ �ϸ� ArrayIndexOutIfBoundsException�� �߻��Ѵ�. ���ϱ�?
			/*for(int i = list.size(); i>=0; i--) {
				list.remove(i);
			}
			System.out.println(list);*/
			
			// �迭�� 0 ���� ���۵Ǵ°��� �˰��ִ�.
			// �׷��� �Ʒ��� ���� ����� ���ܰ� �߻����� �ʴ´�.
			/*for(int i = list.size()-1; i>=0; i--) {
				list.remove(i);
			}*/
			list.clear();
			System.out.println(list);
		}
	}

