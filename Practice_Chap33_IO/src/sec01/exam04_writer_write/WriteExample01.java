package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/test.txt");
		char[] data = "ȫ�浿".toCharArray(); //���ڿ��� char �迭�� ����
		
		for(int i = 0; i<data.length; i++) {
			//write()�� ȣ���ϰ� ���ܰ� �߻�ġ �ʾҴٸ�, ���������� ������ �� ���̴�.
			writer.write(data[i]);
			System.out.println("���� �� : " + i); //�� 3���� ���εȴ�.
		}
		writer.flush(); // ���۸� ������ ���
		writer.close(); // �ڿ� ����
	}
}
