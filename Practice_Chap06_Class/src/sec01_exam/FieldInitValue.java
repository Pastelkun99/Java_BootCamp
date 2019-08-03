package sec01_exam;

public class FieldInitValue {
	
	// 멤버변수라고도 하고, 필드라고도 함. 설계도
	
	byte byteField; //1
	short shortField; //2
	int intField; //4
	long longField; //8
	
	boolean booleanField; //1
	char charField; //2(윾니코드) 1(아스키코드)
	
	float floatField; //4
	double doubleField; //8
	
	//참조형변수
	int[] arrField; //4
	String referenceField; //4
	
	//toString()의 역할은 멤버변수(필드)의 값들을 수시로 확인하고자 할때나,
	//자신의 형식대로 출력을 원할때 toString()오버라이딩을 한다.
	
	@Override //어노테이션 Annotation = 컴파일러에게 따로 지시하는 부분
	public String toString() {
		return "String";
	}
}

