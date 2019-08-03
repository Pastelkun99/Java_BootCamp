package sec_verify.exam04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class HanGulCopy {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:/Users/PC/Desktop/빅데이터/text1.txt");
		int readdata;
		char[] cbuf = new char[50];
		String data = "";
		
		while((readdata = reader.read(cbuf)) != -1) {
			data += new String(cbuf, 0, readdata);
		}
		
		Writer writer = new FileWriter("C:/Users/PC/Desktop/빅데이터/text1복사본.txt");
		char[] chardata = data.toCharArray();
		writer.write(chardata);
		System.out.println("지정한 경로에 text1복사본 파일이 생성되었습니다.");
		reader.close();
		writer.flush();
		writer.close();
	}
}
