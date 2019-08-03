package sec03.exam02_file_input_stream;

import java.io.FileInputStream;

public class FIleInputStreamExample {

	public static void main(String[] args) {
		try {
			// \ 는 이스케이프 문자이기 때문에 아래와 같이 /로 바꿔준다.
			// 현재 소스코드를 콘솔에 출력해보는 프로그램이다.
			FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\WorkSpace\\Practice_Chap33 (IO기반 입출력)\\src\\sec03\\exam02_file_input_stream\\FIleInputStreamExample.java");
			int data;
			int i = 0;
			// 한 바이트씩 읽는다.
			
			while((data = fis.read()) != -1) {
				//콘솔출력 ( 원래 sysout을 해야하나, 어차피 스트림이므로 write()써도 무방함.
				System.out.write(data); 		//아스키 코드 뿌려줌
				
				// 콘솔출력 sysout사용, 한글은 2바이트기 때문에 깨진다. 그렇기 때문에 바이트 배열로 하는것이 현명함.
				// System.out.print((char)data);
				i++;
			}
			System.out.println("루핑 수 : " + i);
			fis.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}
