package sec_verify07;

import java.util.Stack;

public class StackEx {

	public static Stack<String> back = new Stack<>();
	public static Stack<String> forward = new Stack<>();
	
	public static void printStatus() {
		System.out.println("back : " + back.toString());
		System.out.println("forward : " + forward.toString());
		System.out.println("���� ȭ���� '" + back.peek() + "' �Դϴ�.");
	}
	
	public static void goURL(String url) {
		System.out.println(" = ���ο� �ּҷ� �̵� �� = ");
		back.add(url);
		forward.clear();
	}
	
	public static void goForward() {
		System.out.println(" = '������' ��ư�� ���� �� = ");
		back.add(forward.pop());
	}
	
	public static void goBack() {
		System.out.println(" = '�ڷ�' ��ư�� ���� �� = ");
		forward.add(back.pop());
	}
	
	
	public static void main(String[] args) {
		
		back.push("1.����Ʈ");
		back.push("2.����");
		back.push("3.���̹�");
		back.push("4.����");
		
		
		printStatus();
		System.out.println();
		
		goBack();
		printStatus();
		System.out.println();
		
		goBack();
		printStatus();
		System.out.println();
		
		goForward();
		printStatus();
		System.out.println();
		
		goURL("dgit.com");
		printStatus();
		
	}
}
