package sec01_exam_CastingEx;

public class CastingExample1 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		//car = (car)fe; ���� ����ȯ�� ������ ����
		//car.water();	//������ ���ܰ� �߻���. �ٺ��� ���̰� �ֱ� ����.
		fe2 = (FireEngine)car;	// �ڼ�Ÿ�� <- ����Ÿ��
		fe2.water();

	}

}
