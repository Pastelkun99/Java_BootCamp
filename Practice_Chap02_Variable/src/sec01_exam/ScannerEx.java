package sec01_exam;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		 
		// �Է½�Ʈ���� ���� ������� �Է��� �ַܼ� ������ �� �ֽ��ϴ�.
		// �켱�� ����, �ǽ� ��� ����� �� �׳� ������ ���ø� �˴ϴ�. ������ ü���Ͻʽÿ�.
		Scanner scanner = new Scanner(System.in);
		
		// num���ٰ� 4����Ʈ �޸𸮰����� ����(int��)�� �ްڴ�.
		/*System.out.print("���ڸ� ������ �ϳ� �Է��ϼ��� > ");
		int num = scanner.nextInt();
		System.out.println("num = " +  num);*/
		
		// dnum���ٰ� 8����Ʈ �޸𸮰����� �Ǽ�(double��)�� �ްڴ�.
		/*System.out.print("�Ǽ��� �ϳ� �Է��ϼ��� > ");
		double dnum = scanner.nextDouble();
		System.out.println("dnum = " + dnum);*/
		
		System.out.print("���ϴ� ���ڸ� �Է��ϼ��� >> ");
		String input = scanner.nextLine(); // ����Ű�� �Է��Ҷ������� ���ڿ��� �������ִ� �޼���, ��������� next
		int num1 = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("String���� �Է��� ���� : " + input);
		System.out.println("input�� ������ ��ȯ�� ���� : " + num1);

		//���ҽ� ����(�Է½�Ʈ��) Ű���峪 ���콺 ��
		scanner.close();
	}

}
