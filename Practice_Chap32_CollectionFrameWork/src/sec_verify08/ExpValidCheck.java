package sec_verify08;

import java.util.Stack;

public class ExpValidCheck {

	public static Stack<String> st = new Stack<>();
	
	public static String expression1 = "( (2*70 + 3 - 1)";
	public static String expression2 = "( (2*70 + 3 - 1";
	
	public static void ExpressionCheck(String expression) {
		if(expression.equals(expression1)) {
			System.out.println("��ȣ�� ��ġ�մϴ�.");
		}
		else
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("expression1 : " + expression1);
		ExpressionCheck(expression1);
		System.out.println("expression2 : " + expression2);
		ExpressionCheck(expression2);
	}
}
