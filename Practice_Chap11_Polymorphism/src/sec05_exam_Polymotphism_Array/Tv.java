package sec05_exam_Polymotphism_Array;

public class Tv extends Product {

	//����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
	public Tv() {
		super(100);		//tv������ 100����
	}
	
	//ObjectŬ������ toString()�� �������̵� ��.
	@Override
	public String toString() {
		return "Tv";
	}
}