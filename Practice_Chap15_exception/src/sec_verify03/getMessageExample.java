package sec_verify03;

public class getMessageExample {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}
		catch (Exception e) {
			System.out.println("�߻� ������ �޽����� ����մϴ�. ==> " + e.getMessage());
		}

	}
}
