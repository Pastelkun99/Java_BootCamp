package sec02_exam_method;

public class StringToLowerUpperExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAva Programming";
		
		System.out.println(str1.equalsIgnoreCase(str2));	// <- ��ҹ��� ������� ����.
		//�ڹٴ� ��ҹ��ڸ� �����Ѵ�.
		
		System.out.println(str1.equals(str2));		//false ���� ���� : java�� ��ҹ��ڸ� �����Ѵ�.
		
		String lowerstr1 = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();
		
		System.out.println(lowerstr1.equals(lowerstr2));	//true�� ������ ����
	}
}
