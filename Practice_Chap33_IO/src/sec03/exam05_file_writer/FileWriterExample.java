package sec03.exam05_file_writer;

import java.io.FileReader;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		// Filereader 는 문자 단위로 읽기 때문에, 텍스트가 아닌 
		// 그림, 오디오, 비디오 등의 파일은 읽을 수 없다.
		FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\WorkSpace\\Practice_Chap33 (IO기반 입출력)\\src\\sec03\\exam01_file\\FileExample.java");
		int readCharNo;
		char[] cbuf = new char[100];
		int i = 0;
		// 문자열을 읽으면 문자배열에 저장하고 읽은 문자바이트 수를 리턴한다.
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
			i++;
		}
		System.out.write(13);
		System.out.println("루핑 수 : " + i);
		fr.close();
	}
}
