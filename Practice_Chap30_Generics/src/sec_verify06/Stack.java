package sec_verify06;

public class Stack<T> {

	int tos;
	int capacity;
	Object[] stck;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		stck = new Object[capacity];
	}
	
	public void push(T item) {
		try {
			stck[tos] = item;
			tos++;
		} catch (Exception e) {
			System.out.println("������ �� á�׿�! ��ü�� �� �־��!");
			System.out.println("���� �߻����� ���α׷��� ���� �����մϴ�.");
		}
	}
	
	public T pop() {
		try {
			tos--;
			T o = (T)stck[tos];
			return o;
		} catch (Exception e) {
			System.out.println("������ ����׿�. ��ü�� �����! null�� ����ؿ�!");
			return null;
		}
		
	}
}
