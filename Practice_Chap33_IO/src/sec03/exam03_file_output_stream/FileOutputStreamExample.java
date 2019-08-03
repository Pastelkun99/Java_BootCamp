package sec03.exam03_file_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// ������ �����ϱ� ���� ��θ� ����
		String originalFileName = "C:\\Users\\PC\\Desktop\\�� ����\\house.jpg";
		String targetFileName = "C:\\Temp\\�迬��.jpg";
		
		File file = new File("C:\\Users\\PC\\Desktop\\�� ����\\house.jpg");
		
		// FileInputStream, FileOutputStream�� �� ��θ� �ش�.
		// ����� ������, ��������, �׸�����, �������� �� �� ����Ʈ ������� �Ǿ��ֱ� ������ �����ϴ�.
		// ������, Reader�� Writer�� �������ϸ� �����ϰԲ� Ưȭ�Ǿ��ִ�.
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		int i = 0;
		
		// ����Ʈ �迭�� ũ�� ���� ���� ����ð��� ��������.
		// byte[] readBytes = new byte[10000];
		byte[] readBytes = new byte[100];
		long currentTime = System.currentTimeMillis(); // ���� ���� ����
		
		// 100����Ʈ��ŭ �а� �����Ѵ�.
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo); 		// ���� ����Ʈ ����ŭ ��½�Ʈ������ ������.
			i++;
		}
		fos.flush();
		
		long endTime = System.currentTimeMillis(); //������ �� ������ �����Ѵ�.
		System.out.println("���� �� : " + i + " ����ð� : " + (endTime - currentTime) + "ms"
							+ "\t ������ ������ ũ�� : " + file.length()/1024 + "Kbyte");
		
		fos.close();
		fis.close();
		System.out.println(file.getName() + " ������ ���簡 �Ϸ�Ǿ����ϴ�.");
	}
}
