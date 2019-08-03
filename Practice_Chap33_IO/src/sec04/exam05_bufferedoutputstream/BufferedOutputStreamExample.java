package sec04.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = 0;
		long start = 0;
		long end = 0;
		
		// �� �Է½�Ʈ���� FileInputStream���� ������, BufferedInputStream������Ʈ���� �����Ͽ���.
		fis = new FileInputStream("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\����Ű��(���ܾ�).mp3");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\exam09\\����Ű��(���ܾ�).mp3");
		
		start = System.currentTimeMillis();
		
		while( (data = bis.read()) != -1) {
			fos.write(data);
		}
		
		fos.flush();
		end = System.currentTimeMillis(); 
		
		fos.close();
		bis.close();
		fis.close();
		System.out.println("BufferedOutputStream ������� �ʾ��� �� : " + (end-start) + "ms");
		
		System.out.println();
		
		fis = new FileInputStream("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\����Ű��(���ܾ�).mp3");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:\\\\Users\\\\PC\\\\Desktop\\\\������\\\\���� ���� �͵�\\\\JAVA ����\\\\29. IO��� �����\\\\exam09\\\\����Ű��(���ܾ�).mp3");
		
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		bos.flush();
		end = System.currentTimeMillis();
		
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("BufferedOutputStream ������� �� : " + (end-start) + "ms");
	}
}
