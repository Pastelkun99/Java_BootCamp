package sec04.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception{
		
		// 문자 파일에 저장하는 FileOutputStream을 생성했지만 바이트기반이다. 하여 아래와 같이
		// 문자를 바이트로 변환하는 InputStreamWriter을 보조스트림으로 연결해주면 된다.
		FileOutputStream fos = new FileOutputStream("C:/test.txt");
		Writer writer = new OutputStreamWriter(fos);
		// 아웃풋스트림라이터를 쓰기위해 반드시 아웃풋스트림이 존재해야함.
		
		String data = "문자데이터를 보조출력스트림으로 보내어 바이트기반으로 변환되어 저장됨.";
		writer.write(data); // 보조스트림, 즉 문자기반스트림인 OutputStreamWriter로 data를 보내어
							// 바이트 기반으로 변환시켜줌.
		writer.flush();		// 버퍼 강제 비우기
		writer.close();		// 자원 해제
		fos.close();
		System.out.println("파일 저장이 끝났습니다.");
		
	}
}
