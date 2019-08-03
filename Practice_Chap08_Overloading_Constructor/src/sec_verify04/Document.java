package sec_verify04;

public class Document {

	static int count = 0;
	String name;
	
	public Document() {
		this("자바.txt");
	}
	
	public Document(String name) {
		this.name = name;
		System.out.println("문서 " + name + "가 생성되었습니다.");
	}
}
