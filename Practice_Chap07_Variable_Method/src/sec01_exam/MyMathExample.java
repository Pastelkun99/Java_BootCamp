package sec01_exam;

public class MyMathExample {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5l, 3l); //l�� ���̻��̴�. �Ⱥ��̸� int������ ����.
		long result2 = mm.subtract(5l, 3l);
		long result3 = MyMath.multiply(5l, 3l); // Mymath.multiply�� ���� �÷�����, static�����̹Ƿ�
		double result4 = MyMath.divide(5l, 3l);
		
		System.out.println("add(5l, 3l) = " 		+ result1);
		System.out.println("subtract(5l, 3l) = " 	+ result2);
		System.out.println("multiply(5l, 3l) = " 	+ result3);
		System.out.println("divide(5l, 3l) = " 		+ result4);
		
		System.out.println(mm.studyJava());

	}

}
