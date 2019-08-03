package sec_verify.exam03;

import java.io.FileReader;
import java.io.Reader;

public class HangulExample {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:/Users/PC/Desktop/∫Úµ•¿Ã≈Õ/text1.txt");
		int readdata;
		char[] cbuf = new char[50];
		String data = "";
		
		while((readdata = reader.read(cbuf)) != -1) {
			data += new String(cbuf, 0, readdata);
		}
		
		System.out.println(data);
		reader.close();
	}
}
