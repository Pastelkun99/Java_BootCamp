package sex02_exam_SuperTest;

public class Child extends Parent {

	int x = 100;
	
	public void method() {
		System.out.println("���� �ν��Ͻ��� x = " + x);
		System.out.println("�ڼ�Ŭ���� : this.x = " + this.x);
		System.out.println("����Ŭ���� : super.x = " + super.x);
	}
	
	@Override
	public String toString() {
		return "�޷�";
	}
}
