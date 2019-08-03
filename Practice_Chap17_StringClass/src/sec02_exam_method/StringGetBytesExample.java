package sec02_exam_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {

		String str = "�ȳ��ϼ���";
		
		//���ڵ� (��ǻ�Ͱ� ���� ���� ��ȯ�ϴ� ����)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);		//10����Ʈ�� ���´�. ������?
		
		//���ڵ� (����� �˾ƺ��� ���� ��ȯ�ϴ� ����)
		String str1 = new String(bytes1); 
		System.out.println("����Ʈ => ���ڿ� : " +str1);
		
		try {
			//���ڼ��� ������ �� �����ϰ� ����� ���� �ۼ����̳�, ����������Ҷ� ���� ������ ����.
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);	//10����Ʈ ������?
			
			String str2 = new String(bytes2, "UTF-8");	// EUC-KR�� �ѱ��� 2����Ʈ ����Ѵ�. ����. ���ڼ��� �ٸ��� ����
			System.out.println("����Ʈ => ���ڿ� : " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);	//15����Ʈ ������?
			
			String str3 = new String(bytes3, "UTF-8");		//UTF-8 ���ڼ��� �ѱ� ���ڸ� 3����Ʈ�� ���
			System.out.println("����Ʈ => ���ڿ� : " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
