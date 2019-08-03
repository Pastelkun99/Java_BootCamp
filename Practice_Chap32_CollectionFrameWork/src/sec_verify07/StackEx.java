package sec_verify07;

import java.util.Stack;

public class StackEx {

	public static Stack<String> back = new Stack<>();
	public static Stack<String> forward = new Stack<>();
	
	public static void printStatus() {
		System.out.println("back : " + back.toString());
		System.out.println("forward : " + forward.toString());
		System.out.println("현재 화면은 '" + back.peek() + "' 입니다.");
	}
	
	public static void goURL(String url) {
		System.out.println(" = 새로운 주소로 이동 후 = ");
		back.add(url);
		forward.clear();
	}
	
	public static void goForward() {
		System.out.println(" = '앞으로' 버튼을 누른 후 = ");
		back.add(forward.pop());
	}
	
	public static void goBack() {
		System.out.println(" = '뒤로' 버튼을 누른 후 = ");
		forward.add(back.pop());
	}
	
	
	public static void main(String[] args) {
		
		back.push("1.네이트");
		back.push("2.야후");
		back.push("3.네이버");
		back.push("4.다음");
		
		
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
