package sec03_multy_Catch;

public class CatchOrderKindExamle {

	public static void main(String[] args) {
		
		try {
			//�������ܰ� �߻��� �� �ֳ�?
			String data1 = args[0];
			String data2 = args[1];
			//���� �������ܰ� �߻��� �� �ֳ�?
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + " = " + result);
		}
		/*catch(Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			System.out.println("���α׷��� ���������մϴ�.");
		}*/
		//������ ���ܰ� �߻��ϴ� ����? - ������ �����ͼ� �갡 �� ��ư�. �������� ������ �ȵȴ�.
		//��Ƽ ĳġ(JDK1.7���� ����)
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfException�߻�");
			System.out.println("���� �Ű����� �����մϴ�.");
			System.out.println("������ : java CatchByExceptionKindExample num1 num2");
			System.out.println("���α׷��� ���������մϴ�.");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException �߻�");
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�. �Ű������� ���� Ȯ���ϼ���!");
			System.out.println("���α׷��� ���� �����մϴ�.");
		}
		catch(Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			System.out.println("���α׷��� ���������մϴ�.");
		}
		finally {
			System.out.println("�ٽ� �����ϼ���!");
		}
	}
}
