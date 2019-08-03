package sec_verify02;

import java.util.Arrays;
import java.util.Scanner;


public class SortSearchExample {

	public static Student findStudent(Student[] arr, String Hakbun) {

		for(int i=0; i<arr.length; i++) {
			if(arr[i].getHakbun().equals(Hakbun)) {
				return arr[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("775697", "홍길동");
		Student s2 = new Student("995267", "신동욱");
		Student s3 = new Student("557685", "박동수");
		Student s4 = new Student("441235", "김건모");
		Student s5 = new Student("120445", "김민수");
		
		System.out.println("[0] 번째 학생 학번 : " + s1.getHakbun());
		System.out.println("[0] 번째 학생 이름 : " + s1.getName());
		System.out.println("[1] 번째 학생 학번 : " + s2.getHakbun());
		System.out.println("[1] 번째 학생 이름 : " + s2.getName());
		System.out.println("[2] 번째 학생 학번 : " + s3.getHakbun());
		System.out.println("[2] 번째 학생 이름 : " + s3.getName());
		System.out.println("[3] 번째 학생 학번 : " + s4.getHakbun());
		System.out.println("[3] 번째 학생 이름 : " + s4.getName());
		System.out.println("[4] 번째 학생 학번 : " + s5.getHakbun());
		System.out.println("[4] 번째 학생 이름 : " + s5.getName());
		System.out.println();
		
		
		Student[] arr = {s1, s2, s3, s4, s5};
		Arrays.sort(arr);
		
		System.out.println("----------------------------------------");
		System.out.println("학번 내림차순으로 정렬합니다.");
		
		int i = 0;
		
		for(Student st : arr) {
			System.out.println("[" + i + "] 번째 학생 학번 : " + st.getHakbun() + "\t\t [" + i + "] 번째 학생 이름 : " + st.getName());
			i++;
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.print("찾고 싶은 학생의 학번 : >> ");
		Scanner scanner = new Scanner(System.in);
		String find = scanner.nextLine();
		
		Student stu = findStudent(arr, find);
		int index = Arrays.binarySearch(arr, stu);
		
		System.out.println(stu.getName() + "학생은 " + index + "번째 방에 있습니다.");
		scanner.close();
		
	}
}
