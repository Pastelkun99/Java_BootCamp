package sec02_try_catch_finally;

public class TryCatchExample {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4/0); 	//try�ȿ��� ���ܰ� ������ catch ������ ���
		}
		catch (Exception e) {
			System.out.println(5); //5�� ����� ���� �ʴ´�. ��?
		}
		
		System.out.println(6);
	}

}
