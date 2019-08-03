package sec01_list.exam01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		// �⺻ ���� �뷮�� ��?
		List<String> list = new ArrayList<>();
		
		list.add("ȫ�浿");
		list.add("������");
		list.add("Java");
		list.add("JDBC");
		list.add(2, "����Ŭ");
		list.add("������");
		list.add("������");
		//list.add(15); ���� �߻�, �� ������?
		
		int size = list.size(); 		//Arraylist�� ����(����)�Ǿ� �ִ� �� ��ü �� ����
		System.out.println("�� ��ü �� : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2�� �ε����� �ִ� ��ü : " + skill);
		System.out.println();
		System.out.println("���� ��");
		skill = list.get(0);
		System.out.println("0�� �ε����� �ִ� ��ü : " + skill);
		System.out.println();
		System.out.println("���� ��");
		list.remove("ȫ�浿");
		skill = list.get(0);
		System.out.println("0�� �ε����� �ִ� ��ü : " + skill);
		
		System.out.println();
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i + " ��° ��ü : " + list.get(i));
		}
		
		list.remove(2); //java�� ������.
		System.out.println();
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i + " ��° ��ü : " + list.get(i));
		}
		
		// �־��� ��ü�� ã�� �� �����ϴ� ���� �ƴ϶� ���� ����� ��ü�� ������.
		list.remove("������");
		// list.remove("������");
		System.out.println();
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i + " ��° ��ü : " + list.get(i));
		}
	}
}
