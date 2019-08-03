package sec_verify02;

import java.util.Arrays;
import java.util.Scanner;

public class SortSearchExample02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ��� >> ");
		int input = scanner.nextInt();
		Student[] stuarr = new Student[input];
		
		for(int i = 0; i<stuarr.length; i++) {
			System.out.print("[" + i + "] ��° �л��� �й� : ");
			String stunum = scanner.next();
			System.out.print("[" + i + "] ��° �л��� �̸� : ");
			String stuname = scanner.next();
			stuarr[i] = new Student(stunum, stuname);
		}
		
		Arrays.sort(stuarr);
		
		System.out.println("-------------------------------------------");
		System.out.println("�й� ������������ �����մϴ�.");
		/*for(int i = 0; i<stuarr.length; i++) {
			System.out.println("�й� [" + i + "] = " + stuarr[i].getHakbun() + "\t\t �̸�[" + i + "] = " + stuarr[i].getName());
		}*/
		int c = 0;
		for(Student st : stuarr) {
			System.out.println("[" + c + "] ��° �л� �й� : " + st.getHakbun() + "\t\t [" + c + "] ��° �л� �̸� : " + st.getName());
			c++;
		}
		System.out.println("-------------------------------------------");

		System.out.print("ã�� ���� �л��� �й� : ");
		String findhak = scanner.next();
		
		Student student = null;
		for(int i = 0; i<stuarr.length; i++) {
			if(findhak.equals(stuarr[i].getHakbun())) {
				System.out.print(stuarr[i].getName() + " �л��� ");
				student = stuarr[i];
			}
			else {}
		}
		
		int bang = Arrays.binarySearch(stuarr, student);
		System.out.print(bang +"��° �濡 �ֽ��ϴ�.");
		scanner.close();
	}
	
}
