package sec_verify.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileViewer {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/test.txt");
		int readByte;
		
		while((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		
		is.close();
	}
}
