package sec04_exam_generic_method_1;

public class Util {

	// <T>�� ���׸� Ÿ�� �޼��带 �ǹ��ϸ�, ����Ÿ�԰� �Ű����� ���׸� Ÿ���� 
	// <T>�� �ϰڴٴ� �ǹ� �ܺηκ��� TŸ���� �޾Ƽ� Box��ü�� �����Ͽ�
	// �� ��ü�� �����ϴ� �޼���
	
	public static<T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		// return this.box // static�޼��忡���� this�� ����� ���� ����.
		
		// ���׸� Ÿ�� �޼ҵ忡�� static�ڿ� ���׸��� ������ ������ �� ���׸� Ÿ���� �޼ҵ带 ȣ���� ������ 
		// �̹� ������ �Ǿ��ֱ� ����. �׷��� �ϰ����� ��� ¥������ �κ��̱� �ϴ�.
	}
}
