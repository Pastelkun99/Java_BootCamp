package sec01_exam;

public class SwitchCharExample {

	public static void main(String[] args) {

		char grade = 'B';

		// Switch ������ if������ �Ϻ��ϰ� ��ü�� �����Ͽ� �� ������ �ʴ� ���������,
		// true/false�� �����ϱ� ����� �����̳� ���ѵ� �ᱣ�� �� �ϳ��� ���ؾ� �Ҷ���
		// switch ������ �� ���� �� �ֽ��ϴ�.
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
			// break ������ ���ٸ�, �� ������ ���� �� �� �Ʒ��� �ִ� ��� ������ ����˴ϴ�.
			// ���� ���ǿ� �´� �ڵ尡 ����� �ڿ�, break ������ ���� switch ������
			// ��� �� �ֵ��� �����մϴ�.
		case 'b':
		case 'B':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}

	}
}