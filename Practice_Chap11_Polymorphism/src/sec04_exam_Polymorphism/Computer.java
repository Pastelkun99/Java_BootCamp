package sec04_exam_Polymorphism;

public class Computer extends Product {

	// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
	public Computer() {
		super(300); // computer������ 300����
	}

	// ObjectŬ������ toString()�� �������̵� ��.
	@Override
	public String toString() {
		return "Computer";
	}
}
