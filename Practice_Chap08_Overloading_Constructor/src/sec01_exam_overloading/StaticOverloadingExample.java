package sec01_exam_overloading;

public class StaticOverloadingExample {

	public static void main(String[] args) {
		
		int result = StaticOverloadingExample.add(3,5);
		System.out.println(result);
		int[] result2 = new int[] {0}; //�迭�� �����ϰ� result2[0]�� ���� 0���� �ʱ�ȭ
		
		StaticOverloadingExample.add(3,5,result2); // �迭�� add�޼����� �Ű������� ����

		System.out.println(result2[0]);
	}

	//add() Overloading
	static int add(int a, int b) {
		return a+b;
	}
	
	//�迭���� �� �ּ��̴�.
	static void add(int a, int b, int[] result) {
		result[0] = a + b; //�Ű������� �Ѱܹ��� �迭�� �������� ����
	}
	
}
