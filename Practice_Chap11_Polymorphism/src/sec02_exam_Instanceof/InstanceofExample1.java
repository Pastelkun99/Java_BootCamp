package sec02_exam_Instanceof;

class Car {
}

class FireEngine extends Car {
}

public class InstanceofExample1 {

	public static void main(String[] args) {

		FireEngine fe = new FireEngine();

		// instanceof �������� ����� ���̸� ����ȯ�� �����ϴٶ�� �Ϳ� �ָ��Ͻʽÿ�.
		// a instance of b �� �������� ���Ǹ�, �̴� true Ȥ�� false�� ��ȯ�մϴ�. (if�� �������� ��밡��)
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if (fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if (fe instanceof Object) {
			System.out.println("This is an Object instance");
		}

		// ��������.getClass()�� ���������� �ν��Ͻ��� �����Ͷ�� �޼����̸�,
		// getName()�� �ش�Ŭ������ ��Ű���� Ŭ���� ���� ����ϴ� ���̴�.
		// ����, getSimpleName()�� ��Ű������ �����ϰ� �ܼ� Ŭ������ ����ϴ� �޼����̴�.
		System.out.println(fe.getClass().getName()); // Ŭ������ ��Ű���̸� ���
		System.out.println(fe.getClass().getSimpleName()); // Ŭ������ �̸��� ���
	}

}
