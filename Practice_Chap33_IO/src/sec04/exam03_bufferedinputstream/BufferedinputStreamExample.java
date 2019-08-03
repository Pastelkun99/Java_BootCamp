package sec04.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedinputStreamExample {

	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		
		// ����Ʈ ������� �ӵ��� ���̸� ���� ���� ���α׷��̴�.
		// PC ��翡 ���� ���̰� ������.
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\����Ű��(���ܾ�).mp3");
		
		System.out.println("����Ʈ ��� �б� ����");
		start = System.currentTimeMillis();
		//�׳� �б⸸ �Ѵ�.
		while(fis1.read() != -1) {}
		
		System.out.println("����Ʈ ��� �б� ��");
		end = System.currentTimeMillis();
		System.out.println("���۸� ������� �ʾ��� �� (����Ʈ ���) : " + (end-start) + "ms");
		fis1.close();
		
		System.out.println();
		// �� �Է½�Ʈ�� FileInputStream���ٰ� �ӵ���� ������Ʈ���� BufferedInputStream�� ������.
		// Ȥ�� �߸� ������ ���� �ִµ�, BufferedInputStream�� ������Ʈ���̱� ������ ������
		// �о�� ���� ����.
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\����Ű��(���ܾ�).mp3");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		System.out.println("���� ��� �б� ����");
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		
		System.out.println("���� ��� �б� ��");
		end = System.currentTimeMillis();
		
		System.out.println("���۸� ������� �� (���� ���) : " + (end-start) + "ms");
		bis.close();
		fis2.close();
		
		
	}
}
