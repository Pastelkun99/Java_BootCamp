package sec_verify.exam09;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\exam09\\";
		File file = new File(path);
		String[] str = file.list();
		
		for(int i = 0; i<str.length; i++) {
			String fname = str[i];
			if(fname.contains(".txt")) {
				File delete = new File(path + fname);
				System.out.println(fname + "파일이 삭제되었습니다.");
				delete.delete();
			}
		}
		
	}
}
