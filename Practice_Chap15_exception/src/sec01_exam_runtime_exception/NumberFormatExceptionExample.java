package sec01_exam_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "100a";
		
		int value1 = Integer.parseInt(data1);
		
		//numberformatexception �߻�, ������? ���ڿ��� ���ڰ� ���ԵǾ��־� ���ڷ� ��ȯ�Ұ�
		int value2 = Integer.parseInt(data2);
		
		
	}

}
