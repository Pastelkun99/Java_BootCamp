package sec01_verify;

public class Exercise07 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println("1 + x << 3�� �� : " + ((x + 1)<<3));
		// ����Ʈ�����ڴ� ��������ں��� �켱������ ����.
		
		System.out.println("y >= 5 || x < 0 && x > 2�� ���� : " + (y >= 5 || x < 0 && x > 2));
		// or�����ڴ� and�����ں��� �켱������ ����.
		
		System.out.println("y += 10 - x++�� �� : " + (y += 10 - x++));
		// x�� ���������ϹǷ�, ���� �Ŀ����� (y + 10) - 2 �� �����ϸ�, ���� x�� ���� 3�� ��. 
		
		System.out.println("x += 2�� �� : " + (x += 2));
		// ���� ���������� ������ x�� ���� 3�� �Ǿ���.
		
		System.out.println("!('A' <= c && c <='Z')�� �� : " + (!('A' <= c && c <='Z')));
		// char c = 'A'�� 'Z'�����ٴ� �۰�, 'A'���� ����. �ᱹ &&�� ��� ���̹Ƿ� true���� ����ǳ�, not������ ������ false�� ��ȯ��.
		
		System.out.println("'C' - c�� �� : " + ('C' - c));
		// 'C'�� int ���� 67, 'A'�� int���� 65�̴�. �ᱹ 67 - 65
		
		System.out.println("'5' - '0' �� �� : " + ('5' - '0'));
		// '5'�� int ���� 53, '0'�� int ���� 48�̴�. �ᱹ 53 - 48
		
		System.out.println("++c�� �� : " + (++c));
		
		System.out.println("c++�� �� : " + (c++));
		// �������������� ������ c�� ���� 1 ������.
		
		System.out.println("c�� �� : " + c);

	}

}
