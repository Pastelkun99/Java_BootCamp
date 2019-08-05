package sec02_exam_Instanceof02;

class Parent {
}

class Child extends Parent {
}

public class InstanceofExample2 {

	// �ָ��Ұ��� �Ű������� ����Ÿ���̶�� ��.

	public static void method1(Parent parent) {
		// �ſ� �߿��� �ڵ�
		if (parent instanceof Child) {
			// ���� ��Ӱ��迡 �����Ƿ� instanceof �������� ����� true�̹Ƿ� ����ĳ������ ����
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ ����");
		}
		// ���α׷��� �ۼ��ϴٰ� Ŭ���� �� ����ȯ�� �̷������ �� ��, ������ ���� �޼ҵ带 ����
		// ����ȯ�� ���������� �̸� �ľ��Ͽ� �ùٸ� ������ ������ �� �ֽ��ϴ�.
	}

	public static void method2(Parent parent) {
		if (parent instanceof Child) {
			parent = new Child();
			// Child child = (Child)parent;
			System.out.println("method2 - Child�� ��ȯ ����");
		} else {
			System.out.println("method2 - Child�� ��ȯ ����");
		}
	}

	public static void main(String[] args) {
		// parentA �� ���� �������� ������ �� �ڵ��̰�, parentB�� �������� ������� �ڵ�
		Parent parentA = new Child();
		InstanceofExample2.method1(new Child()); // ����
		InstanceofExample2.method2(parentA); // ����

		Parent parentB = new Parent();
		InstanceofExample2.method1(parentB); // ����

		// �������� ����Ǹ鼭 �޼��� ȣ���� �Ǿ� ��ȯ�� �����ϴ�.
		InstanceofExample2.method1(new Child()); // ����
		InstanceofExample2.method2(parentB); // ����
	}

}
