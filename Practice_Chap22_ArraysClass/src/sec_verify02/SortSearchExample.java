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
		
		Student s1 = new Student("775697", "ȫ�浿");
		Student s2 = new Student("995267", "�ŵ���");
		Student s3 = new Student("557685", "�ڵ���");
		Student s4 = new Student("441235", "��Ǹ�");
		Student s5 = new Student("120445", "��μ�");
		
		System.out.println("[0] ��° �л� �й� : " + s1.getHakbun());
		System.out.println("[0] ��° �л� �̸� : " + s1.getName());
		System.out.println("[1] ��° �л� �й� : " + s2.getHakbun());
		System.out.println("[1] ��° �л� �̸� : " + s2.getName());
		System.out.println("[2] ��° �л� �й� : " + s3.getHakbun());
		System.out.println("[2] ��° �л� �̸� : " + s3.getName());
		System.out.println("[3] ��° �л� �й� : " + s4.getHakbun());
		System.out.println("[3] ��° �л� �̸� : " + s4.getName());
		System.out.println("[4] ��° �л� �й� : " + s5.getHakbun());
		System.out.println("[4] ��° �л� �̸� : " + s5.getName());
		System.out.println();
		
		
		Student[] arr = {s1, s2, s3, s4, s5};
		Arrays.sort(arr);
		
		System.out.println("----------------------------------------");
		System.out.println("�й� ������������ �����մϴ�.");
		
		int i = 0;
		
		for(Student st : arr) {
			System.out.println("[" + i + "] ��° �л� �й� : " + st.getHakbun() + "\t\t [" + i + "] ��° �л� �̸� : " + st.getName());
			i++;
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.print("ã�� ���� �л��� �й� : >> ");
		Scanner scanner = new Scanner(System.in);
		String find = scanner.nextLine();
		
		Student stu = findStudent(arr, find);
		int index = Arrays.binarySearch(arr, stu);
		
		System.out.println(stu.getName() + "�л��� " + index + "��° �濡 �ֽ��ϴ�.");
		scanner.close();
		
	}
}
