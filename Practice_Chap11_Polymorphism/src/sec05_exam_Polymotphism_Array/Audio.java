package sec05_exam_Polymotphism_Array;

public class Audio extends Product {

	//����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
	public Audio() {
		super(50);		//audio������ 300����
	}
	
	//ObjectŬ������ toString()�� �������̵� ��.
	@Override
	public String toString() {
		return "Audio";
	}
}
