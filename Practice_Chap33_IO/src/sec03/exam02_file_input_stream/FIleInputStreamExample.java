package sec03.exam02_file_input_stream;

import java.io.FileInputStream;

public class FIleInputStreamExample {

	public static void main(String[] args) {
		try {
			// \ �� �̽������� �����̱� ������ �Ʒ��� ���� /�� �ٲ��ش�.
			// ���� �ҽ��ڵ带 �ֿܼ� ����غ��� ���α׷��̴�.
			FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\WorkSpace\\Practice_Chap33 (IO��� �����)\\src\\sec03\\exam02_file_input_stream\\FIleInputStreamExample.java");
			int data;
			int i = 0;
			// �� ����Ʈ�� �д´�.
			
			while((data = fis.read()) != -1) {
				//�ܼ���� ( ���� sysout�� �ؾ��ϳ�, ������ ��Ʈ���̹Ƿ� write()�ᵵ ������.
				System.out.write(data); 		//�ƽ�Ű �ڵ� �ѷ���
				
				// �ܼ���� sysout���, �ѱ��� 2����Ʈ�� ������ ������. �׷��� ������ ����Ʈ �迭�� �ϴ°��� ������.
				// System.out.print((char)data);
				i++;
			}
			System.out.println("���� �� : " + i);
			fis.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}
