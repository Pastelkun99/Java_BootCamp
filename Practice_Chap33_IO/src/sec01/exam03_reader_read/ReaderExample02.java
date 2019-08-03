package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample02 {

	public static void main(String[] args) throws Exception {
		// Reader의 하위 클래스인 FileReader를 생성하여 대입
		Reader reader = new FileReader("C:/test.txt");
		int readData;
		char[] cbuf = new char[2]; // 길이는 2
		String data = "";
		
		// 아래와 같이 StringBuilder클래스를 사용해도 된다.
		// StringBuilder db = new StringBuilder();
		
		// read()의 매개타입이 문자 배열이다.
		while((readData = reader.read(cbuf)) != -1) {
			//sb.append(sbuf)
			data += new String(cbuf, 0, readData); // 읽은 문자열을 문자열로 생성
			System.out.println("읽은 문자 수 : " + readData); //유니코드 출력
		}
		System.out.println(data); //문자열 출력
		// System.out.println(sb); //문자열 출력
		reader.close();
	}
}
