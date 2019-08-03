package sec_verify02;

import java.util.Arrays;
import java.util.Scanner;

public class SortSearchExample02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 >> ");
		int input = scanner.nextInt();
		Student[] stuarr = new Student[input];
		
		for(int i = 0; i<stuarr.length; i++) {
			System.out.print("[" + i + "] 번째 학생의 학번 : ");
			String stunum = scanner.next();
			System.out.print("[" + i + "] 번째 학생의 이름 : ");
			String stuname = scanner.next();
			stuarr[i] = new Student(stunum, stuname);
		}
		
		Arrays.sort(stuarr);
		
		System.out.println("-------------------------------------------");
		System.out.println("학번 내림차순으로 정렬합니다.");
		/*for(int i = 0; i<stuarr.length; i++) {
			System.out.println("학번 [" + i + "] = " + stuarr[i].getHakbun() + "\t\t 이름[" + i + "] = " + stuarr[i].getName());
		}*/
		int c = 0;
		for(Student st : stuarr) {
			System.out.println("[" + c + "] 번째 학생 학번 : " + st.getHakbun() + "\t\t [" + c + "] 번째 학생 이름 : " + st.getName());
			c++;
		}
		System.out.println("-------------------------------------------");

		System.out.print("찾고 싶은 학생의 학번 : ");
		String findhak = scanner.next();
		
		Student student = null;
		for(int i = 0; i<stuarr.length; i++) {
			if(findhak.equals(stuarr[i].getHakbun())) {
				System.out.print(stuarr[i].getName() + " 학생은 ");
				student = stuarr[i];
			}
			else {}
		}
		
		int bang = Arrays.binarySearch(stuarr, student);
		System.out.print(bang +"번째 방에 있습니다.");
		scanner.close();
	}
	
}
