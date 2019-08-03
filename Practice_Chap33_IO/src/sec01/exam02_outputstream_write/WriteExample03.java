package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		
		// ���Ϸκ��� ��½�Ʈ���� �����Ͽ� �����Ѵ�. (������)
		OutputStream os = new FileOutputStream("C:/test.txt"); 	//�Ϲݿ��ܹ߻�
		byte[] data = "ABC������".getBytes();
		// byte[] data = "ABC".getBytes();

		// ����Ʈ �迭�� �ѹ��� ��Ʈ������ ������. ������ ���� �ε����� 1�̰�,
		// ���̸� 2��ŭ�� ������.
		System.out.println("data ����Ʈ �迭�� ũ�� : " + data.length);
		os.write(data, 1, 2); // BC�� test.txt�� �����.
		
		os.flush();
		os.close();
	}
}
