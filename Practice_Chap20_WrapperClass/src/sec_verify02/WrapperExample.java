package sec_verify02;

public class WrapperExample {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		
		char c = '4';
			
		Double d = new Double(3.1234566);
		
		System.out.println("�빮�� A�� �ҹ��ڷ� ��ȯ : " + Character.toLowerCase('A'));
		System.out.println("���� c�� ���ڷ� ��ȯ�Ͽ� ��� : " + c);
		System.out.println("���ڿ� -123�� ������ ��ȯ�Ͽ� ��� : " + Integer.parseInt("-123"));
		System.out.println("16������ ǥ���� ���ڿ� 10�� ������ ��ȯ�Ͽ� ��� : " + Integer.parseInt("10", 16));
		System.out.println("28�� 2���� ǥ���� ��Ÿ���� ���ڿ� ��� : " + Integer.toBinaryString(28));
		System.out.println("28�� 2�������� 1�� ������ ��� : " + Integer.bitCount(28));
		System.out.println("28�� 16���� ǥ���� ��Ÿ���� ���ڿ� ��� : " + Integer.toHexString(28));
		System.out.println("i ���� double�� ��ȯ�Ͽ� ��� : " + (double)i);
		System.out.println("d ���� ���ڿ��� ��ȯ�Ͽ� ��� : " + d.toString());
		System.out.println("���ڿ� 44.13e-16�� double�� ��ȯ�Ͽ� ��� : " + Double.parseDouble("44.13e-16"));
		
	}
}