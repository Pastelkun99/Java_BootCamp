package sec05_exam_Polymotphism_Array;

public class Computer extends Product {

	// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
	public Computer() {
		super(200); // computer������ 300����
	}

	// ObjectŬ������ toString()�� �������̵� ��.
	@Override
	public String toString() {
		return "Computer";
	}
}
