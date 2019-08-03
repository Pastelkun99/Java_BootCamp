package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample02 {

	public static void main(String[] args) throws Exception {
		// Reader�� ���� Ŭ������ FileReader�� �����Ͽ� ����
		Reader reader = new FileReader("C:/test.txt");
		int readData;
		char[] cbuf = new char[2]; // ���̴� 2
		String data = "";
		
		// �Ʒ��� ���� StringBuilderŬ������ ����ص� �ȴ�.
		// StringBuilder db = new StringBuilder();
		
		// read()�� �Ű�Ÿ���� ���� �迭�̴�.
		while((readData = reader.read(cbuf)) != -1) {
			//sb.append(sbuf)
			data += new String(cbuf, 0, readData); // ���� ���ڿ��� ���ڿ��� ����
			System.out.println("���� ���� �� : " + readData); //�����ڵ� ���
		}
		System.out.println(data); //���ڿ� ���
		// System.out.println(sb); //���ڿ� ���
		reader.close();
	}
}
