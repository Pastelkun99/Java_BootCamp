package sec03.exam05_file_writer;

import java.io.FileReader;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		// Filereader �� ���� ������ �б� ������, �ؽ�Ʈ�� �ƴ� 
		// �׸�, �����, ���� ���� ������ ���� �� ����.
		FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\WorkSpace\\Practice_Chap33 (IO��� �����)\\src\\sec03\\exam01_file\\FileExample.java");
		int readCharNo;
		char[] cbuf = new char[100];
		int i = 0;
		// ���ڿ��� ������ ���ڹ迭�� �����ϰ� ���� ���ڹ���Ʈ ���� �����Ѵ�.
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
			i++;
		}
		System.out.write(13);
		System.out.println("���� �� : " + i);
		fr.close();
	}
}
