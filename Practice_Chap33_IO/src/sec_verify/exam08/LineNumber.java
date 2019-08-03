package sec_verify.exam08;

import java.io.File;
import java.util.Scanner;

public class LineNumber {

	public static void main(String[] args) throws Exception {
		
		System.out.print("텍스트 파일을 입력하세요. >> ");
		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine();
		File file = new File("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\" + path);
		Scanner sc = new Scanner(new File("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\" + path));
		int i = 1;
		while(i<3) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(":");
			
			System.out.println(i + ":" + line);
			i++;
			
		}
	}
}
