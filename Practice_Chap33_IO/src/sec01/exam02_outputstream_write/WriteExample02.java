package sec01.exam02_outputstream_write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		
		// ���Ϸκ��� ��½�Ʈ���� �����Ͽ� �����Ѵ�(������)
		OutputStream os = new FileOutputStream("C:/test.txt");
		
		// "ABC������" ��� ���ڿ����� ����Ʈ �迭�� ���� (���ڵ�)
		byte[] data = "ABC������".getBytes("UTF-8");
		
		// ����Ʈ �迭�� �ѹ��� ��Ʈ������ ������. �ռ� write(int b)�޼��忡 ���� �ξ� ȿ�����̴�.
		System.out.println("data����Ʈ �迭�� ũ�� : " + data.length);
		os.write(data);
		os.flush(); 		//write�� ����ϸ� ������ flush()�� ȣ���Ͽ� �޸𸮸� �����
		
		InputStream is = new FileInputStream("C:/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		int i = 0;
		
		// InputStream�� read(byte[] b)�޼���� ������ ���̻� ���ٸ�, -1 ���� ������
		while((readByteNo = is.read(readBytes)) != -1) {
			i++;
			String str = new String(readBytes, "UTF-8");
			System.out.println("���� �� : " + str);
			System.out.println("���� ����Ʈ �� : " + readByteNo);
		}
		System.out.println("���� �� : " + i);
		os.close(); 	// �ڿ� ����
		
	}
}
