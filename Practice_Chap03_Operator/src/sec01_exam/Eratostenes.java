package sec01_exam;

public class Eratostenes {

	public static void main(String[] args) {

		int num;
		int count;
		int i;
		int primenumbercount = 0;

		for (num = 2; num <= 1000; num++) {
			count = 0;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					count += 1;
				}
			}
			if (count == 0) {
				primenumbercount++;
				System.out.println(num + "�� �Ҽ�");
			}
		}
		System.out.println("���� �Ҽ��� ���� : " + primenumbercount);
	}

	// ���� �˰����� �Ҽ�(Prime Number)�� ã�� �˰����Դϴ�.
	// �����佺�׳׽��� ü ��� �Ҹ���, ������ ��ǻ�� ���α׷��� �˰��� �����Դϴ�.
}
