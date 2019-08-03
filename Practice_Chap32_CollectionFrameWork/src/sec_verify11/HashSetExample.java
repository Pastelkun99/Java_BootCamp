package sec_verify11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"������"));
		set.add(new Student(2,"�迬��"));
		set.add(new Student(1,"�տ���"));
		set.add(new Student(2,"�迬��"));
		set.add(new Student(5,"�赿��"));
		set.add(new Student(4,"Ȳ����"));
		set.add(new Student(1,"������"));
		set.add(new Student(3,"�ڱٿ�"));
		
		int size = set.size();
		System.out.println("�� ��ü �� : " + size);
		
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student temp = it.next();
			System.out.println("�й� : " + temp.getStudentNum() + " �̸� : " + temp.getName());
		}
		
	}
}
