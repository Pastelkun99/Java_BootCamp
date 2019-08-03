package sec_verify.exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		
		String path = "C:/test.txt";
		
		byte[] readis = new byte[1000];
		
		InputStream is = new FileInputStream(path);
		
		OutputStream os = new FileOutputStream("C:/Users/PC/Desktop/testº¹»çº».txt");
		while(is.read(readis, 0, readis.length) != -1) {
			os.write(readis);
		}
		
		is.close();
		os.flush();
		os.close();
		
	}
}
