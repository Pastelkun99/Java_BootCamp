package sec06_throws;

public class ThrowExample02 {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			e.printStackTrace();	
		}
		
	}
	public static void findClass() throws ClassNotFoundException {
		//ClassNotFoundException�� �߻������� �Ϲ� �����̴�.
		Class clazz = Class.forName("java.lang.String2");	//���� ���ܰ� �߻��ϴ� �κ�
	}

}
