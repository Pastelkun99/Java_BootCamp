package sec_verify.exam11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args) throws Exception {
		
		String originalFileName = "C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\img.jpg";
		String targetFileName = "C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\img복사본.jpg";
		
		File file = new File("C:\\Users\\PC\\Desktop\\빅데이터\\과제 받은 것들\\JAVA 과제\\29. IO기반 입출력\\자바 파일 입출력\\img.jpg");
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		
		byte[] readBytes = new byte[1000];
		
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo); 		
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println(file.getName() + "를 " + targetFileName + "로 복사하였습니다.");
	}
}

