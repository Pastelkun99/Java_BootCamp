package sec_verify.exam08;

import java.io.File;
import java.util.Scanner;

public class LineNumber {

	public static void main(String[] args) throws Exception {
		
		System.out.print("�ؽ�Ʈ ������ �Է��ϼ���. >> ");
		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine();
		File file = new File("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\" + path);
		Scanner sc = new Scanner(new File("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\" + path));
		int i = 1;
		while(i<3) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(":");
			
			System.out.println(i + ":" + line);
			i++;
			
		}
	}
}
