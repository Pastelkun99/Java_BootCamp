package sec02_exam_generic_type;

//���׸� Ÿ�� ����
public class Tv<T> {

	// �Ʒ� T�� ���߽� ����ڰ� ��ü�� Ÿ���� �����ϸ�
	// �� Ÿ������ ��� ������� ��������.
	
	private T t;
	
	public T getT() {
		return this.t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}