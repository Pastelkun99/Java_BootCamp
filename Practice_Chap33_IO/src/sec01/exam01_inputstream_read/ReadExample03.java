package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample03 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes, 2, 3); 	//시작 인덱스가 2이고 3개만 읽어서 리턴
		System.out.println("읽은 바이트 수 : " + readByteNo);
		System.out.println();
		
		for(Byte b : readBytes)
			System.out.println("읽은 바이트 : " + b);
		is.close();
	}
}
