package sec05_exam_InterfaceExample_Direct;


//������ ���迡 ���� Ŭ���� A�� B
//AŬ������ BŬ������ ����ϴ� ����

public class A {

	//�Ű����� Ŭ���� B Ÿ���̴�. �ٽø���, B�� ������ ������ A���� �����ħ
	
	public void methodA(B b) {
		b.methodB();
	}
}