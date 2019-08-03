package sec_verify.exam10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) throws Exception {
		
		Vector<String> vec = new Vector<>();
		FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\words.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String temp = "";
		
		boolean flag = false;
		
		while((temp = br.readLine()) != null) {
			vec.add(temp);
		}
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			String input;
			System.out.print("ã�´ܾ� >> ");
			input = scan.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			
			for(String str : vec) {
				if(str.contains(input)) {
					System.out.println(str);
					flag = true;
				}
			}
			
			if(!flag) {
				System.out.println("�߰��� �� ����.");
			}
			flag = false;
		}
	}
}
