package sec01_exam;

public class Variable_Pri_Ref {

	public static void main(String[] args) {

		// �⺻�� ����
		int a; // �������� �����ϱ� ���� ����
		a = 10; // ���� ���� ����

		// int a = 10; ó�� ����� �� ������ ���ÿ� �� �� ������,
		// Ư���� ��츦 �����ϰ� �� ����� �� ���� ���� �˴ϴ�.

		// ������ ����
		// ������ ������ ������ �ش� �����Ͱ� �ڸ��� �޸��� �ּҰ� ����˴ϴ�.
		// ���� null ������ �ʱ�ȭ�� �����մϴ�.
		String str = null;
		str = new String("�ڹ�");
		// str = "�ڹ�"; �� ������ �ǹ̸� �����ϴ�. ��ó�� ������ ���� String�� �ϳ��� ��ü�� ��޹޴´ٴ� ����
		// �����ֱ� ���� ������, ������ �̷��� String ������ �����ϰ� ����ϴ� ���� �年�ϴ�.

		System.out.println(str); // �ڹٷ� ����� �Ǵ� ���� Ȯ���� �� �ֽ��ϴ�.

		System.out.println("a�� �� : " + a);
		System.out.println("���� " + str + " !");

		String str2 = null;
		System.out.println(str2);

	}

}
