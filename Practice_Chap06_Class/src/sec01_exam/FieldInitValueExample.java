package sec01_exam;

public class FieldInitValueExample {

	public static void main(String[] args) {
		//flv �ν��Ͻ�(��ü) ����
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("�⺻�� ����");
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		
		//charŸ���� ���� ����.
		System.out.println("charField: " + fiv.charField);
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println();
		System.out.println("������ ����");
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
		
		/*�ν��Ͻ� ������ ����ϸ�, �ν��Ͻ��� �ּҰ� ����� ��.
		 Object�� ��ӹޱ� ������ ��¹��� ���������� ������ �� ObjectŬ������ toString() �ڵ� ȣ���.
		 ������, ������ �������̵�(������)�� toString()�� ȣ��ȴ�.
		 */
		
		System.out.println("Class ReferenceVailable : " + fiv.toString());
		

	}

}
