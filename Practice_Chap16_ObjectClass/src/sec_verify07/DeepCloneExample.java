package sec_verify07;

public class DeepCloneExample {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10,10, -5, -5);
		System.out.println("���� ���簢���� ����Ʈ");
		System.out.println("[ ���簢���� ��ġ ���� ]");
		r1.showPosition();
		
		
		Rectangle r2 = (Rectangle)r1.clone();
		System.out.println();
		System.out.println("������ ���簢���� ����Ʈ");
		System.out.println("[ ���簢���� ��ġ ���� ]");
		r2.changePos(2, 2, 7, 7);
		r2.showPosition();
		
		
	}

}
