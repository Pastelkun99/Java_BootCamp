package sec_verify.exam06;

import java.io.FileReader;

public class UpperCharacter {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\sample.txt");
		int readNo;
		char[] cbuf = new char[100];
		
		while((readNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readNo);
			System.out.print(data.toUpperCase());
		}
		
	}
}
