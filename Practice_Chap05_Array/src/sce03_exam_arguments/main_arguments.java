package sce03_exam_arguments;

public class main_arguments {

	public static void main(String[] args) {
		
		//main()�� �Ű��������� �����ϱ� ���Ͽ� �޴����� Run�� �����ϰ�
		//run_configuration�� Ŭ���Ͽ� ����. �׸��� �Ű��������� �����ϸ� �ȴ�.
		//arguments(�Ű�����)	
		
		if(args.length != 2) {
			System.out.println("���α׷��� ����");
			System.out.println("Java MainStringArrayArgument num1 num2");
			System.exit(0); //�ý��� ��������
		}
		
		String strNum1 = args[0]; //ù��° ������ ���
		String strNum2 = args[1]; //�ι�° ������ ���
		
		int num1 = Integer.parseInt(strNum1); //���ڿ��� ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
