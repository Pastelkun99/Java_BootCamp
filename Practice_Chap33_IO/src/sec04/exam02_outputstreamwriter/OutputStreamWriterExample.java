package sec04.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception{
		
		// ���� ���Ͽ� �����ϴ� FileOutputStream�� ���������� ����Ʈ����̴�. �Ͽ� �Ʒ��� ����
		// ���ڸ� ����Ʈ�� ��ȯ�ϴ� InputStreamWriter�� ������Ʈ������ �������ָ� �ȴ�.
		FileOutputStream fos = new FileOutputStream("C:/test.txt");
		Writer writer = new OutputStreamWriter(fos);
		// �ƿ�ǲ��Ʈ�������͸� �������� �ݵ�� �ƿ�ǲ��Ʈ���� �����ؾ���.
		
		String data = "���ڵ����͸� ������½�Ʈ������ ������ ����Ʈ������� ��ȯ�Ǿ� �����.";
		writer.write(data); // ������Ʈ��, �� ���ڱ�ݽ�Ʈ���� OutputStreamWriter�� data�� ������
							// ����Ʈ ������� ��ȯ������.
		writer.flush();		// ���� ���� ����
		writer.close();		// �ڿ� ����
		fos.close();
		System.out.println("���� ������ �������ϴ�.");
		
	}
}
