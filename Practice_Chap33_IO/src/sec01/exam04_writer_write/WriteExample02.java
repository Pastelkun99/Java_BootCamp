package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/test.txt");
		char[] data = "신은혁".toCharArray(); // 문자열을 문자 배열로 리턴
		
		// write()의 매개변수 타입이 문자배열이다. 호출하고 예외가 발생하지 않았다면,
		// 정상적으로 실행 된 것이다. 
		// 이전, 코드보다 문자배열 자체를 매개값으로 보내기 때문에 훨씬 효율적이다.
		writer.write(data);
		writer.flush();	//강제로 버퍼 비움
		writer.close(); // 자원 해제
	}
}
