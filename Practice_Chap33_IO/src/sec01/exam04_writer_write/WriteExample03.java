package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/test.txt");
		char[] data = "신은혁".toCharArray(); // 문자열을 문자 배열로 리턴
		
		// 호출하고 예외가 발생치 않았다면, 정상적으로 실행이 된 것이다.
		// 시작 인덱스가 1이고 길이가 2이므로 "은혁"만 파일에 저장된다.
		
		writer.write(data, 1, 2);
		writer.flush();	//강제로 버퍼 비움
		writer.close(); // 자원 해제
	}
}
