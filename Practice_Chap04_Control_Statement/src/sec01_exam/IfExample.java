package sec01_exam;

public class IfExample {

	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("������ �Է����ּ���");
		 * 
		 * int score=scanner.nextInt();
		 */

		int score = 93;
		// score ������ ���� �ٲپ� �����غ�����.

		if (score >= 90) {
			System.out.println("������ 90������ �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
		}
		if (score < 90) {
			System.out.println("������ 90������ �����ϴ�.");
			// {}�� �����϶��� ������ �� ������, �����ϸ� �����ִ°� ���⿡ �����ϴ�.
			// �ڵ� ��Ÿ�Ͽ� ���� ���⿡ �´� ����� ����Ͻñ� �ٶ��ϴ�.
			System.out.println("����� B�Դϴ�.");
		}
		
	}
}
