package sec_verify00;

public class MyMathMethodExample {

	public static void main(String[] args) {
		
		MyMathMethod my = new MyMathMethod();
		System.out.println("Ŭ����(static)�޼��� add \tȣ�� " + MyMathMethod.add(200l, 100l));
		System.out.println("Ŭ����(static)�޼��� subtract \tȣ�� " + MyMathMethod.subtract(200l, 100l));
		System.out.println("Ŭ����(static)�޼��� multiply \tȣ�� " + MyMathMethod.multiply(200l, 100l));
		System.out.println("Ŭ����(static)�޼��� divide \tȣ�� " + (double)MyMathMethod.divide(200l, 100l));
		
		System.out.println("�ν��Ͻ� �޼��� add \t\tȣ�� " + my.add());
		System.out.println("�ν��Ͻ� �޼��� subtract \tȣ�� " + my.subtract());
		System.out.println("�ν��Ͻ� �޼��� multiply \tȣ�� " + my.multiply());
		System.out.println("�ν��Ͻ� �޼��� divide \t\tȣ�� " + (double)my.divide());
	}

}
