package sec_verify.exam07;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		
		File file = new File("C:\\");
		File[] contents = file.listFiles();
		long max = contents[0].length();
		String path = "";
		
		for(int i = 0; i<contents.length; i++) {
			if(max < contents[i].length()) {
				max = contents[i].length();
				path = contents[i].getPath();
			}
		}
		
		System.out.println("���� ū ������ " + path + "�̰�, ũ��� " + max + "����Ʈ�̴�.");
	}
}
