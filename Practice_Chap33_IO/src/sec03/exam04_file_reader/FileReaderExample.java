package sec03.exam04_file_reader;

import java.io.File;
import java.io.FileWriter;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		//File ��ü�� �����Ͽ� FileWriter������ �Ű������� ��
		//File file = new File("C:/Temp/file.txt");
		File file = new File("C:/Temp/Readerfile.txt");
		
		// true�� �پ��ֱ� ������ ���� ���Ͽ� append�� �ȴ�. ���ٸ� ����� �ȴ�.
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter�� �ѱ۷� �� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�. " + "\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}
