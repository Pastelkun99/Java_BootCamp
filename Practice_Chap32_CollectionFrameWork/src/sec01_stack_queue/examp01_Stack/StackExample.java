package sec01_stack_queue.examp01_Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		// coin�� �����ϴ� Stack�÷����� ������.
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//coinBox���ٰ� ������ ������ (���� ����)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(150));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(5));
		coinBox.push(new Coin(500));
		
		while(!coinBox.isEmpty()) {
			//���� �ʰ� �� ������ �ϳ��� ����.
			Coin coin = coinBox.pop();
			
			//��°���� ���Լ����� �� ����� �� ���� �ִ�.
			System.out.println("������ ���� : " + coin.getValue());
		}
	}
}
