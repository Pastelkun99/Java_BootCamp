package sec04_throw;

public class ThrowExample {

	public static void main(String[] args) {

		try {
			throw new Exception("���Ƿ� �߻�������");
		}
		//Exception Ŭ������ ��� ������ �����̹Ƿ� � ���ܵ� �� ���� �� �ִ�.
		catch (Exception e) {
			//������ ���
			System.out.println("���� �޽��� : " + e.getMessage());
			
			//���� �޸𸮿� �ִ� ������� ���(���߿�)
			e.printStackTrace();
			
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}

}
