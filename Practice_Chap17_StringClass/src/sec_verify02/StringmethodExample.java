package sec_verify02;

public class StringmethodExample {

	public static void main(String[] args) {
		
		String a = new String("      java,");
		String b = new String("program,fighting       ");
		
		System.out.println("���ڿ� a�� ���ڿ� b�� ������ ��� : " + a + b);
		System.out.println("���ڿ� a�� ������ ������ ��� : " + a.trim() + b);
		System.out.println("���ڿ� a�� a�� 1�� ��ü�� ��� : " + a.trim().replace("a", "1") + b.replace("a", "1"));
		System.out.println("�и��� 0�� ���ڿ� : " + a.trim().substring(0, 4).replace("a", "1"));
		System.out.println("�и��� 1�� ���ڿ� : " + b.trim().substring(0, 7).replace("a", "1"));
		System.out.println("�и��� 2�� ���ڿ� : " + b.trim().substring(8));
		System.out.println("���ڿ� a�� substring�� ��� : " + a.trim().substring(3).replace("a", "1") + b.trim().substring(0).replace("a", "1"));
		
	}
}
