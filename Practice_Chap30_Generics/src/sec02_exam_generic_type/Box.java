package sec02_exam_generic_type;

//�ڽ� Ŭ������ ���׸�Ÿ������ ������.
public class Box<T> {

	private T t;

	//setter
	public void set(T t) {
		this.t = t;
	}
	
	//getter
	public T get() {
		return this.t;
	}

}
