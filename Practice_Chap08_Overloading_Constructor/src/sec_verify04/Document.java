package sec_verify04;

public class Document {

	static int count = 0;
	String name;
	
	public Document() {
		this("�ڹ�.txt");
	}
	
	public Document(String name) {
		this.name = name;
		System.out.println("���� " + name + "�� �����Ǿ����ϴ�.");
	}
}
