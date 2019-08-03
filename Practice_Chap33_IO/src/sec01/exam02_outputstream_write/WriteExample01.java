package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		
		// ���Ϸκ��� ��½�Ʈ���� �����Ͽ� �����Ѵ�(������)
		OutputStream os = new FileOutputStream("C:/test.txt"); // �Ϲ� ���� �߻�
		
		byte[] data = "ABC".getBytes(); // ABC��� ���ڿ����� ����Ʈ �迭�� ����(���ڵ�)
		
		System.out.println(Arrays.toString(data));
		// 3�� ����
		
		for(int i = 0; i<data.length; i++)
			os.write(data[i]);
		
		// write()�� ����ϸ� ������ flush()�� ȣ���Ͽ� �޸� ���۸� ��쵵�� ����.
		// ����, main()�� ����Ǹ� �˾Ƽ� �������� �����ϸ� flush()�� �ϵ��� �ϴ� ���� ����.
		os.flush();
		os.close();
	}
}
