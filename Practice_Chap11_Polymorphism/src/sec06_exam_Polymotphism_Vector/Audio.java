package sec06_exam_Polymotphism_Vector;

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
