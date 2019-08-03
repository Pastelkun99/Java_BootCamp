package sec_verify06;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<>(10);
		
		s1.push("서울");
		s1.push("부산");
		s1.push("광주");
		s1.push("대구");
		s1.push("현풍");
		s1.push("구지");
		s1.push("창녕");
		s1.push("마산");
		s1.push("용인");
		s1.push("고양");
		s1.push("지옥");
		
		System.out.println("stringStack에 push된  객체를 pop()을 통해 끄집어냈습니다");
		
		for(int i = 0; i<10; i++) {
			System.out.println((i+1) + "번째 객체의 값 : " + s1.pop());
		}

		Stack<Integer> s2 = new Stack<>(10);
		
		s2.push(111);
		s2.push(301);
		s2.push(150);
		s2.push(770);
		s2.push(528);
		s2.push(665);
		s2.push(1005);
		s2.push(-55);
		
		System.out.println();
		System.out.println("intStack에 push된  객체를 pop()을 통해 끄집어냈습니다");
		for(int i = 0; i<10; i++) {
			System.out.println((i+1) + "번째 객체의 값 : " + s2.pop());
		}
		
	
	}
}
