package sec_verify06;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<>(10);
		
		s1.push("����");
		s1.push("�λ�");
		s1.push("����");
		s1.push("�뱸");
		s1.push("��ǳ");
		s1.push("����");
		s1.push("â��");
		s1.push("����");
		s1.push("����");
		s1.push("���");
		s1.push("����");
		
		System.out.println("stringStack�� push��  ��ü�� pop()�� ���� ������½��ϴ�");
		
		for(int i = 0; i<10; i++) {
			System.out.println((i+1) + "��° ��ü�� �� : " + s1.pop());
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
		System.out.println("intStack�� push��  ��ü�� pop()�� ���� ������½��ϴ�");
		for(int i = 0; i<10; i++) {
			System.out.println((i+1) + "��° ��ü�� �� : " + s2.pop());
		}
		
	
	}
}
