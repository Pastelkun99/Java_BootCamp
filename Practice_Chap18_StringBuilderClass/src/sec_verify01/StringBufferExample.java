package sec_verify01;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println("���� ��Ʈ�� ���� sb ��� : " + sb.toString());
		System.out.println("��Ʈ�� ���� sb�� �ؽ��� ��� : " + sb.hashCode());
		System.out.println("������ ��Ʈ�� ���� sb ��� : " + sb.append(" is Pencil."));
		System.out.println("������ ��Ʈ�� ���� sb ��� : " + sb.insert(7, " my"));
		
		int length = sb.length();
		
		System.out.println("���ڿ� ���̸� �����Ͽ� ������ ��Ʈ�� ���� sb ��� : " + sb.delete(4, length));
		System.out.println("���ڿ� ���� �� ��Ʈ�� ������ �ؽ� �ڵ� : " + sb.hashCode());	
		System.out.println("���ڿ� ���� �Ŀ��� �ؽ��ڵ尡 ������ ����. ��, ��Ʈ�� ���۴� ���ο� �ν��Ͻ��� ������ �ƴ��Ѵ�.");
		
		
		
		
	}
}
