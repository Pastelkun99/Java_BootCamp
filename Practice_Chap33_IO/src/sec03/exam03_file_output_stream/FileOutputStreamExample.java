package sec03.exam03_file_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// 파일을 복사하기 위해 경로를 설정
		String originalFileName = "C:\\Users\\PC\\Desktop\\새 폴더\\house.jpg";
		String targetFileName = "C:\\Temp\\김연아.jpg";
		
		File file = new File("C:\\Users\\PC\\Desktop\\새 폴더\\house.jpg");
		
		// FileInputStream, FileOutputStream을 얻어서 경로를 준다.
		// 복사는 동영상, 문자파일, 그림파일, 음악파일 등 다 바이트 기반으로 되어있기 때문에 가능하다.
		// 하지만, Reader와 Writer은 문자파일만 가능하게끔 특화되어있다.
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		int i = 0;
		
		// 바이트 배열을 크게 잡을 수록 복사시간이 빨라진다.
		// byte[] readBytes = new byte[10000];
		byte[] readBytes = new byte[100];
		long currentTime = System.currentTimeMillis(); // 현재 시점 저장
		
		// 100바이트만큼 읽고 루핑한다.
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo); 		// 읽은 바이트 수만큼 출력스트림으로 보낸다.
			i++;
		}
		fos.flush();
		
		long endTime = System.currentTimeMillis(); //복사한 후 시점을 저장한다.
		System.out.println("루핑 수 : " + i + " 복사시간 : " + (endTime - currentTime) + "ms"
							+ "\t 복사한 파일의 크기 : " + file.length()/1024 + "Kbyte");
		
		fos.close();
		fis.close();
		System.out.println(file.getName() + " 파일의 복사가 완료되었습니다.");
	}
}
