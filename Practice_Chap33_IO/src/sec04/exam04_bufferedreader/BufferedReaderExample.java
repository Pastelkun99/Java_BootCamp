package sec04.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		 
		InputStream is = System.in;		// 주 입력스트림을 바이트 기반으로 설정
		// 보조스트림1인 바이트를 문자로 바꿔줄 InputStreamReader를 연결
		Reader reader = new InputStreamReader(is);
		
		// 다시 보조스트림1의 읽는 속도를 향상시키기 위해 BufferedReader를 연결함.
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력 : ");
		// 보통, BufferedReader보조스트림은 readLine()을 사용하기위해 많이 사용한다.
		String lineString = br.readLine();
		System.out.println("출력 : " + lineString); 	//바로 에코출력토록 하였다.
		
		// 자원해제
		br.close();
		reader.close();
		is.close();
	}
}
