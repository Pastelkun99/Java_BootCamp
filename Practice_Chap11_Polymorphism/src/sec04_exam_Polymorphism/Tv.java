package sec04_exam_Polymorphism;

public class Tv extends Product {

	// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
	public Tv() {
		super(300); // tv������ 300����
	}

	// ObjectŬ������ toString()�� �������̵� ��.
	@Override
	public String toString() {
		return "Tv";
	}
}
