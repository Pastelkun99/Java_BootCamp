package sec04.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedinputStreamExample {

	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		
		// 바이트 기반으로 속도의 차이를 보기 위한 프로그램이다.
		// PC 사양에 따라 차이가 존재함.
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\젝스키스(세단어).mp3");
		
		System.out.println("바이트 기반 읽기 시작");
		start = System.currentTimeMillis();
		//그냥 읽기만 한다.
		while(fis1.read() != -1) {}
		
		System.out.println("바이트 기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때 (바이트 기반) : " + (end-start) + "ms");
		fis1.close();
		
		System.out.println();
		// 주 입력스트림 FileInputStream에다가 속도향상 보조스트림인 BufferedInputStream을 연결함.
		// 혹시 잘못 이해할 수도 있는데, BufferedInputStream은 보조스트림이기 때문에 파일을
		// 읽어올 수가 없다.
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\젝스키스(세단어).mp3");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		System.out.println("버퍼 기반 읽기 시작");
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		
		System.out.println("버퍼 기반 읽기 끝");
		end = System.currentTimeMillis();
		
		System.out.println("버퍼를 사용했을 때 (버퍼 기반) : " + (end-start) + "ms");
		bis.close();
		fis2.close();
		
		
	}
}
