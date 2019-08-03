package sec04.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		
		// �� �Է½�Ʈ���� ����Ʈ ����� Inputstream���� �����Ѵ�.
		InputStream is = System.in;
		// ���ڸ� �ޱ� ���� ������Ʈ���� �� �Է½�Ʈ���� �����Ѵ�.
		// InputStreamReader�� Reader�� ��ӹ޾Ҵ�.
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		
		// �ݼֿ��� �Է��� ���� ���� -1�� �����ϴ� ���� Ctrl+z�� ������ �ȴ�.
		// �ܼ�â�� ����, ���� â�� �ڼ��� ���캸��.
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo); 	//String���� ����
			System.out.println("Ű����κ��� ���� ���ڿ� : " + data);
		}
		reader.close();
		is.close();
	}
}
