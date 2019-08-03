package sec_verify01;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {

		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95점");
		hashMap.put(new Student("2"), "100점");
		hashMap.put(new Student("3"), "12점");
		
		String value1 = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 점수 : " + value1);
		
		String value2 = hashMap.get(new Student("2"));
		System.out.println("2번 학생의 점수 : " + value2);
		
		String value3 = hashMap.get(new Student("3"));
		System.out.println("3번 학생의 점수 : " + value3);
		
	}

}
