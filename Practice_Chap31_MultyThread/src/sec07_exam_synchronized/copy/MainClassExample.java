package sec07_exam_synchronized.copy;

public class MainClassExample {


	public static void main(String[] args) {
		//������ü ����
		Calculator calculator = new Calculator();
		
		// ������ �ذ�Ǿ���. �ܼ��� ������ �Ǵ� �޼��� �տ� synchronized�� ���� �� ���̴�.
		// �̷��� �Ǹ� ��ü ����� �Ͼ �������� ��Ȯ���� �����ش�.
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
