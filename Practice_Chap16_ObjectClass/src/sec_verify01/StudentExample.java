package sec_verify01;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {

		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95��");
		hashMap.put(new Student("2"), "100��");
		hashMap.put(new Student("3"), "12��");
		
		String value1 = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ���� : " + value1);
		
		String value2 = hashMap.get(new Student("2"));
		System.out.println("2�� �л��� ���� : " + value2);
		
		String value3 = hashMap.get(new Student("3"));
		System.out.println("3�� �л��� ���� : " + value3);
		
	}

}
