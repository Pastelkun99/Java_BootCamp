package sec_verify02;

public class FinallyExceptionExample {

	public static void main(String[] args) {

		int[] num = new int[3];
		
		try {
			num[0] = 1;
			num[1] = 2;
			num[2] = 3;
			for(int i=0; i<3; i++) {
				System.out.println(num[i] / i);
			}
			
		}
		catch (Exception e) {
			System.out.println("0���� ������ ���� ��������~");
		}
		finally {
			System.out.println("�� �κ��� ������ ���Ϳ�~");
		}
	}

}
