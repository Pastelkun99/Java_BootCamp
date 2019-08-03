package sec01_exam_constructor;

import java.util.Arrays;

public class KeyBoardToString {

	public static void main(String[] args) {

		byte[] bytes = new byte[100];		//기본값 0으로 세팅
		//Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		//키보드로 입력받는다. (입력받은 바이트 수를 리턴)
		
		int readByteNo;
		
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes, 0, readByteNo-2);	//2를 빼는 이유는? - 엔터친거 빼려고
			byte[] b = str.getBytes("EUC-KR");
			//str.getBytes("UTF-8");
			//str.getBytes("EUC-KR");
			System.out.println(str);
			
			System.out.println("String값 : " + str);
			System.out.println("byte[] 값 : " + Arrays.toString(b));
			System.out.println("입력받은 바이트 수 : " + readByteNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//scan.close();
		
	}

}
