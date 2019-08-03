package sec04.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		
		// 주 입력스트림을 바이트 기반인 Inputstream으로 설정한다.
		InputStream is = System.in;
		// 문자를 받기 위해 보조스트림을 주 입력스트림에 연결한다.
		// InputStreamReader는 Reader를 상속받았다.
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		System.out.print("문자열을 입력하세요 : ");
		
		// 콜솔에서 입력을 받을 때는 -1을 리턴하는 경우는 Ctrl+z를 누르면 된다.
		// 콘솔창의 실행, 중지 창을 자세히 살펴보자.
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo); 	//String으로 생성
			System.out.println("키보드로부터 읽은 문자열 : " + data);
		}
		reader.close();
		is.close();
	}
}
