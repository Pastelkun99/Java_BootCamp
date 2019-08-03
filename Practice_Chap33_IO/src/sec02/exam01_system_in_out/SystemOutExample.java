package sec02.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		
		//printstream(System.out)은 OutPutStream의 자손클래스이므로 대입이 가능하다.
		
		OutputStream os = System.out;
		//아스키 코드 표를 참고해보도록 하자.
		for(byte b = 48; b<58; b++) {
			System.out.print("아스키코드 write()후 출력된 문자값 : " );
			os.write(b);
			System.out.println();
		}
		os.write(13); // 줄바꿈을 위해 아스키코드 값을 write함
		for(byte b = 97; b<123; b++) {
			System.out.print("아스키코드 write()후 출력된 문자값 : ");
			os.write(b);
			System.out.println();
		}
		os.write(13);
		String hangul = "나는 직업 전문학교 다니는 학생입니다.";
		//String 에서 바이트 배열을 얻는다.
		byte[] hangulBytes = hangul.getBytes(); 	
		os.write(hangulBytes);		//한번에 문자열 출력
		os.flush();
		os.close();
	}
}
