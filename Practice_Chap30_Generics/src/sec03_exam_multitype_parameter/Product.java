package sec03_exam_multitype_parameter;

// 멀티타입 파라메터를 지니는 Product 클래스
public class Product<T, M> {
	
	private T t;
	private M m;

	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public M getM() {
		return m;
	}
	
	public void setM(M m) {
		this.m = m;
	}

}
