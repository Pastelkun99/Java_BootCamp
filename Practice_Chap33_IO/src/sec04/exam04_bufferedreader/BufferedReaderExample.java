package sec04.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		 
		InputStream is = System.in;		// �� �Է½�Ʈ���� ����Ʈ ������� ����
		// ������Ʈ��1�� ����Ʈ�� ���ڷ� �ٲ��� InputStreamReader�� ����
		Reader reader = new InputStreamReader(is);
		
		// �ٽ� ������Ʈ��1�� �д� �ӵ��� ����Ű�� ���� BufferedReader�� ������.
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("�Է� : ");
		// ����, BufferedReader������Ʈ���� readLine()�� ����ϱ����� ���� ����Ѵ�.
		String lineString = br.readLine();
		System.out.println("��� : " + lineString); 	//�ٷ� ���������� �Ͽ���.
		
		// �ڿ�����
		br.close();
		reader.close();
		is.close();
	}
}
