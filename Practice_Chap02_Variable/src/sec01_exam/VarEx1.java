package sec01_exam;

public class VarEx1 {

	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		
		System.out.printf("%d %d %n", year, age); //%d�� decimal(10����)�� ����, %n : �ٹٲ�(����)
		// ���� ���� Ÿ���� C���� ���� ���̴� ����Դϴ�. �ڹٿ����� �ַ� '+'�� ����Ͽ� ���ڿ��� �����մϴ�.
		
		System.out.println(year); 
		System.out.println(age + "��μ�"); // ������ �����ϰ� �����, �����Ѵ�. age�� ���ڿ��μ� ����
		
		System.out.println();
		
		year = age + 2000;   // ���� age�� ���� 2000�� ���ؼ� ���� year�� �����մϴ�.
		age = age + 1;       // ���� age�� ����� ���� 1 ������ŵ�ϴ�.
		
		System.out.println(year);
		System.out.println(age);

	}

}
