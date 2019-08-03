package sec05_exam_generic_polymorthism;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

	// List�迭�� �÷���, List�� �������̽��̰�, Arraylist�� list �������̽��� ������ Ŭ����
	// �������̽� �ʵ��� ������
	List<T> list = new ArrayList<T>();
	
	//�÷��� ��ü �߰�, ������ ���ϸ� ��ü�� �ּҰ��� ����Ǵ� ��
	public void add(T item) {
		list.add(item);
	}
	
	//�÷��� ��ü �ε����� ã�ƿ���
	public T get(int i) {
		return list.get(i);
	}
	
	//�÷��� ũ�� ��ȯ
	public int size() {
		return list.size();
	}
	
	// �÷��ǿ� �ִ� �׸��� ��� ���
	public String toString() {
		return list.toString();
	}
}
