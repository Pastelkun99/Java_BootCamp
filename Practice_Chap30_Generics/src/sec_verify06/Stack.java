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
			System.out.println("스택이 꽉 찼네요! 객체를 못 넣어요!");
			System.out.println("예외 발생으로 프로그램을 정상 종료합니다.");
		}
	}
	
	public T pop() {
		try {
			tos--;
			T o = (T)stck[tos];
			return o;
		} catch (Exception e) {
			System.out.println("스택이 비었네요. 객체가 없어요! null을 출력해요!");
			return null;
		}
		
	}
}
