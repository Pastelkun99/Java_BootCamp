package sec04_exam_thismethod;

public class CarExample {

	public static void main(String[] args) {

		Car c1 = new Car(); // �⺻������ ȣ���ߴµ� �� �ʱ�ȭ�� �Ǽ� ����� �ǳ�? // this.�� ����Ǿ��ִ� �͵� ������
		Car c2 = new Car("blue"); // �Ű������� 1���� ������ ȣ��
		Car c3 = new Car("Green", "����"); // �Ű������� 2���� ������ ȣ��

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
