package sec04.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = 0;
		long start = 0;
		long end = 0;
		
		// 주 입력스트림을 FileInputStream으로 설정후, BufferedInputStream보조스트림을 연결하였다.
		fis = new FileInputStream("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\젝스키스(세단어).mp3");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\exam09\\젝스키스(세단어).mp3");
		
		start = System.currentTimeMillis();
		
		while( (data = bis.read()) != -1) {
			fos.write(data);
		}
		
		fos.flush();
		end = System.currentTimeMillis(); 
		
		fos.close();
		bis.close();
		fis.close();
		System.out.println("BufferedOutputStream 사용하지 않았을 때 : " + (end-start) + "ms");
		
		System.out.println();
		
		fis = new FileInputStream("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\젝스키스(세단어).mp3");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:\\\\Users\\\\PC\\\\Desktop\\\\빅데이터\\\\과제 받은 것들\\\\JAVA 과제\\\\29. IO기반 입출력\\\\exam09\\\\젝스키스(세단어).mp3");
		
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		bos.flush();
		end = System.currentTimeMillis();
		
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("BufferedOutputStream 사용했을 때 : " + (end-start) + "ms");
	}
}
