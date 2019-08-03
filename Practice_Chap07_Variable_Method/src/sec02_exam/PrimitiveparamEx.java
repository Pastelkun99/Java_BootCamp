package sec02_exam;

public class PrimitiveparamEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		//ex) 동생에게 몇시냐라고 물어보는 꼴
		
		change(d.x);
		
		System.out.println("After change(d.x)");	
		System.out.println("main() : x = " + d.x);

	}

	//기본형 매개변수
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
}
