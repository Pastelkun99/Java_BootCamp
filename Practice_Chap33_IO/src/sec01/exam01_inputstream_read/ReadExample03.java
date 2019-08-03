package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample03 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes, 2, 3); 	//���� �ε����� 2�̰� 3���� �о ����
		System.out.println("���� ����Ʈ �� : " + readByteNo);
		System.out.println();
		
		for(Byte b : readBytes)
			System.out.println("���� ����Ʈ : " + b);
		is.close();
	}
}
