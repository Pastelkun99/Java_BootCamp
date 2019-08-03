package sec_verify.exam10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) throws Exception {
		
		Vector<String> vec = new Vector<>();
		FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\words.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String temp = "";
		
		boolean flag = false;
		
		while((temp = br.readLine()) != null) {
			vec.add(temp);
		}
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			String input;
			System.out.print("찾는단어 >> ");
			input = scan.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			for(String str : vec) {
				if(str.contains(input)) {
					System.out.println(str);
					flag = true;
				}
			}
			
			if(!flag) {
				System.out.println("발견할 수 없음.");
			}
			flag = false;
		}
	}
}
