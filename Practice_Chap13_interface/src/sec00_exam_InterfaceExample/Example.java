package sec00_exam_InterfaceExample;

public class Example {

	public static void main(String[] args) {

		// �������̽��� �����ߴٶ�� ���� ����Ŭ������ �������̽��� �ڼ�Ŭ������ ���� �ǹ��մϴ�.
		// ���� �������� ����˴ϴ�.

		A a = new Person();
		Person p = new Person();

		a.method();
		// a.method2();
		p.method();

		A a1 = new Member(); // �������̽� �ʵ��� �������� ����
		a1.method();

	}

}
