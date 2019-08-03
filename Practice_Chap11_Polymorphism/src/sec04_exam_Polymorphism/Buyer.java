package sec04_exam_Polymorphism;

public class Buyer {

	int money = 1000;		//�����ݾ�
	int bonusPoint = 0;		//���ʽ� ����
	
	//�Ű����� Product p�� ������ ��Ȯ�� �����ϴ� ���� �ſ� �߿�! (������ ����)
	//Product�Ӹ��ƴ϶� Product�� ��ӹ޴� � Ŭ������ �� �Ű������� ���� �� �ִ�.
	
	public void buy(Product p) {
		
		if(this.money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			this.money = 0;
			return;
		}
		
		//���� ������ ������ ��ǰ�� ������ ����.
		this.money -= p.price;
		
		//��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "�� �����ϼ̽��ϴ�.");
	}
	
}
