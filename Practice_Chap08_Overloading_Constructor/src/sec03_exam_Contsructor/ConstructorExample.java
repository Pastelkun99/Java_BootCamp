package sec03_exam_Contsructor;

public class ConstructorExample {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1(); // 기본생성자를 호출
		//Data2 d2 = new Data2(); // exception 발생? 이유? = 생성자가 없다. Data2는 매개변수가 있기때문.
		
		d1.value = 10;
		System.out.println(d1.value);
		
		Data2 d3 = new Data2(3); //매개변수가 있는 생성자를 호출
		System.out.println(d3.value);

	}

}
