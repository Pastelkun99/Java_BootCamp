package sec01_firstArray_Exam;

public class Array_Example06 {

	public static void main(String[] args) {

		char[] abc = new char[] { 'A', 'B', 'C', 'D' };
		char[] num = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.println(abc); // char[]�� �迭 ���� ���� �״�� ����մϴ�.
		System.out.println(num);

		// �迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� ������� �Ѵٸ�?
		char[] result = new char[abc.length + num.length];

		// System.arraycopy�� �Ű����� (Java.lang.System Ŭ���� API����)
		// Object src : ���� �迭
		// int srcPos : ���� �迭�� ���縦 ������ �ε���
		// Object dest : Ÿ�� �迭
		// int destPos : Ÿ�� �迭�� �ٿ��ֱ⸦ ������ �ε���
		// int length : ������ ����
		// System.arraycopy(abc, 0, result, 0, abc.length);
		// �� ����մϴ�. ���� �������� �ʽ��ϴ�.
		
		System.arraycopy(num, 0, result, abc.length, num.length);

		System.out.println(result);

		// �迭 abc�� �迭 num�� ù�� ° ��ġ�κ��� �迭 abc���̸�ŭ �����մϴ�.
		System.arraycopy(abc, 0, num, 0, abc.length);
		// System.out.println(num.toString());

		// number�� �ε��� 6 ��ġ�� 3���� �����մϴ�.
		System.arraycopy(abc, 0, num, 6, 3);
		// System.out.println(num);

	}

}
