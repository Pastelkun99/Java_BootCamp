package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/test.txt");
		char[] data = "������".toCharArray(); // ���ڿ��� ���� �迭�� ����
		
		// write()�� �Ű����� Ÿ���� ���ڹ迭�̴�. ȣ���ϰ� ���ܰ� �߻����� �ʾҴٸ�,
		// ���������� ���� �� ���̴�. 
		// ����, �ڵ庸�� ���ڹ迭 ��ü�� �Ű������� ������ ������ �ξ� ȿ�����̴�.
		writer.write(data);
		writer.flush();	//������ ���� ���
		writer.close(); // �ڿ� ����
	}
}
