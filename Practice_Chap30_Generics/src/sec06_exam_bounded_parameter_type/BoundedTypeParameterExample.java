package sec06_exam_bounded_parameter_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		
		// int result = Util.compare("ȫ�浿", "�赿��"); ������ ������?
		// int result2 = Util.<Integer>compare(100.1, 200); ������ ������?
		//int resutl3 = Util.compare(new Object(), new Object()); // Ÿ�����ѿ� �ɸ�
		//int result4 = Util.compare(new Number(), new Number());
			
		
		// ���� ��ü�� �����ؼ� �ѱ�� ��������, �׳� ���ڰ��� ������ �ڵ����� �ڽ��� �ȴ�.
		int result1 = Util.compare(100, 200);
		System.out.println(result1);
		
		result1 = Util.compare(100.1, 200);
		System.out.println(result1);
		
		result1 = Util.compare(new Integer(100), new Integer(200));
		System.out.println(result1);
		
		result1 = Util.compare(new Double(400.77), new Integer(200));
		System.out.println(result1);
		
		result1 = Util.compare(4.5, 1);
		System.out.println(result1);
		
		result1 = Util.compare(4.5, 4.5);
		System.out.println(result1);
	}
}
