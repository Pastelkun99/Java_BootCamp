package sec01_exam;

public class VarEx2 {

	public static void main(String[] args) {

		int x = 10;
		int y = x + 10;
		int temp = 0; // �ӽú���

		System.out.println("x: " + x + "  y: " + y + "  tmp: " + temp);
		// �� �ٲٱ�
		
		// x=y;
		// y=x;
		// �� ���� ���� x�� y�� ���� ���� �ٲ� �� �������?
		
		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x + "  y: " + y + "  tmp: " + temp);
	}

}
