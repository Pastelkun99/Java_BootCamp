package sec02.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		
		//printstream(System.out)�� OutPutStream�� �ڼ�Ŭ�����̹Ƿ� ������ �����ϴ�.
		
		OutputStream os = System.out;
		//�ƽ�Ű �ڵ� ǥ�� �����غ����� ����.
		for(byte b = 48; b<58; b++) {
			System.out.print("�ƽ�Ű�ڵ� write()�� ��µ� ���ڰ� : " );
			os.write(b);
			System.out.println();
		}
		os.write(13); // �ٹٲ��� ���� �ƽ�Ű�ڵ� ���� write��
		for(byte b = 97; b<123; b++) {
			System.out.print("�ƽ�Ű�ڵ� write()�� ��µ� ���ڰ� : ");
			os.write(b);
			System.out.println();
		}
		os.write(13);
		String hangul = "���� ���� �����б� �ٴϴ� �л��Դϴ�.";
		//String ���� ����Ʈ �迭�� ��´�.
		byte[] hangulBytes = hangul.getBytes(); 	
		os.write(hangulBytes);		//�ѹ��� ���ڿ� ���
		os.flush();
		os.close();
	}
}
