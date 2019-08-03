package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample04 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/test.txt"); //다형성이 적용됨
		String str = "안녕 자바 프로그램! 김혜란 술 좀 그만 마셔라";
		
		//매개변수가 String 타입이다. 하여 String 을 파일에 그대로 저장하게 된다.
		writer.write(str);
		
		//시작 인덱스가 3, 문자수는 2개만 출력함
		//writer.write(str, 3, 2);
		
		writer.flush();
		writer.close();
	}
}
