package sec01_exam_CastingEx;

public class CastingExample2 {

	public static void main(String[] args) {

		Car car = new Car(); 	// Car �ν��Ͻ� ���� new FireEngine(); ���� �ٲٸ� �ذ��.
		// Car car = null; Car �ν��Ͻ� ����

		// ����Ÿ���� �ν��Ͻ��� ������ �ڼ�Ÿ���� �ν��Ͻ��� �ٷ� �� ����.
		// (�������� ����� small -> many �δ� �Ұ�)
		// �ݴ�� ���.

		// Car2�� null �ʱ�ȭ
		Car car2 = null;
		FireEngine fe = new FireEngine(); // fe�� null�ʱ�ȭ

		// Car�� drive()�޼��� ȣ��
		car.drive();
		// �ڼ�Ÿ���� �ν��Ͻ��� ������ ����Ÿ���� �ν��Ͻ��� �ٷ� �� ����.
		// �������� ����� small -> many�δ� �Ұ�
		// �ݴ�� ���
		// car = fe; -> �� �ּ��� �����Ͽ��� ������ �ذ��. ��ĳ����

		fe = (FireEngine)car; // �������� ok ����� ������ �߻�(classCastException�߻�)
		fe.drive();
		car2 = fe;
		car2.drive();
		fe.water();
	}

}
