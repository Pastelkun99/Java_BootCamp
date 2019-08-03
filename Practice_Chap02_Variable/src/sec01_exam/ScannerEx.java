package sec01_exam;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		 
		// 입력스트림을 통해 사용자의 입력을 콘솔로 전송할 수 있습니다.
		// 우선은 과제, 실습 등에서 사용할 때 그냥 가져다 쓰시면 됩니다. 사용법을 체득하십시오.
		Scanner scanner = new Scanner(System.in);
		
		// num에다가 4바이트 메모리공간에 숫자(int형)를 받겠다.
		/*System.out.print("두자리 정수를 하나 입력하세요 > ");
		int num = scanner.nextInt();
		System.out.println("num = " +  num);*/
		
		// dnum에다가 8바이트 메모리공간에 실수(double형)를 받겠다.
		/*System.out.print("실수를 하나 입력하세요 > ");
		double dnum = scanner.nextDouble();
		System.out.println("dnum = " + dnum);*/
		
		System.out.print("원하는 숫자를 입력하세요 >> ");
		String input = scanner.nextLine(); // 엔터키를 입력할때까지의 문자열을 리턴해주는 메서드, 공백단위는 next
		int num1 = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("String으로 입력한 내용 : " + input);
		System.out.println("input을 정수로 변환한 내용 : " + num1);

		//리소스 해제(입력스트림) 키보드나 마우스 등
		scanner.close();
	}

}
