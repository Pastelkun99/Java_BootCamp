package sec01_exam_constructor;

import java.util.Arrays;

public class KeyBoardToString {

	public static void main(String[] args) {

		byte[] bytes = new byte[100];		//�⺻�� 0���� ����
		//Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		
		//Ű����� �Է¹޴´�. (�Է¹��� ����Ʈ ���� ����)
		
		int readByteNo;
		
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes, 0, readByteNo-2);	//2�� ���� ������? - ����ģ�� ������
			byte[] b = str.getBytes("EUC-KR");
			//str.getBytes("UTF-8");
			//str.getBytes("EUC-KR");
			System.out.println(str);
			
			System.out.println("String�� : " + str);
			System.out.println("byte[] �� : " + Arrays.toString(b));
			System.out.println("�Է¹��� ����Ʈ �� : " + readByteNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//scan.close();
		
	}

}
