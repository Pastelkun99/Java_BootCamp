package sec_verify.exam09;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\exam09\\";
		File file = new File(path);
		String[] str = file.list();
		
		for(int i = 0; i<str.length; i++) {
			String fname = str[i];
			if(fname.contains(".txt")) {
				File delete = new File(path + fname);
				System.out.println(fname + "������ �����Ǿ����ϴ�.");
				delete.delete();
			}
		}
		
	}
}
