package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/test.txt");
		char[] data = "������".toCharArray(); // ���ڿ��� ���� �迭�� ����
		
		// ȣ���ϰ� ���ܰ� �߻�ġ �ʾҴٸ�, ���������� ������ �� ���̴�.
		// ���� �ε����� 1�̰� ���̰� 2�̹Ƿ� "����"�� ���Ͽ� ����ȴ�.
		
		writer.write(data, 1, 2);
		writer.flush();	//������ ���� ���
		writer.close(); // �ڿ� ����
	}
}
