package sec_verify.exam11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args) throws Exception {
		
		String originalFileName = "C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\img.jpg";
		String targetFileName = "C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\img���纻.jpg";
		
		File file = new File("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\�ڹ� ���� �����\\img.jpg");
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		
		byte[] readBytes = new byte[1000];
		
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo); 		
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println(file.getName() + "�� " + targetFileName + "�� �����Ͽ����ϴ�.");
	}
}

