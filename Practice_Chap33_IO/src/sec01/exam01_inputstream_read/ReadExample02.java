package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample02 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/test.txt");
		int readByteNo;
		int i = 0;
		byte[] readBytes = new byte[2];
		// InputStream의 read(byte[] b)메서드는 읽을게 더이상 없다면, -1을 리턴함.
		while( (readByteNo = is.read(readBytes)) != -1) {
			// 읽은 바이트 수 리턴
			System.out.println("읽은 바이트의 수 : " + readByteNo);
			// 문자열로 디코딩함.
			String str = new String(readBytes, 0, readByteNo);
			// 아래와 같이 하면, 5바이트 파일이므로 2번째 루핑할때 마지막 데이터는 없기 때문에
			// 예전 데이터가 출력된다.
			// String str = new String(readBytes);
			System.out.println("읽은 문자열 : " + str);		//문자열 출력
			// System.out.println(str); //문자열 출력
			i++;
		}
		System.out.println("루핑수 : " + i); 		//문자열 출력
		
		// 아래와 같이 작성해도 된다. 마음대로 하면 됨
		/*while(true) {
			readByte = is.read();
			if(readByte == -1)	//읽었다면 -1을 저장하지 않을 것이다.
				break;
			System.out.println("읽은 바이트 : " + readByte); 		//아스키 코드 값 출력
		}*/
		is.close();
		
	}
}
