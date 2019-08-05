package sec06_exam_Polymotphism_Vector;

import java.util.Vector;

public class Buyer {

	int money = 100000; // �����ݾ�
	int bonusPoint = 0; // ���ʽ� ����

	// �Ű����� Product p�� ������ ��Ȯ�� �����ϴ� ���� �ſ� �߿�! (������ ����)
	// Product�Ӹ��ƴ϶� Product�� ��ӹ޴� � Ŭ������ �� �Ű������� ���� �� �ִ�.

	Vector item = new Vector();

	public void buy(Product p) {

		if (this.money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			this.money = 0;
			return;
		}
		this.money -= p.price; // ���� ������ ������ ��ǰ�� ������ ����.
		this.bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		this.item.add(p); // ��ǰ�� Vector�� �����Ѵ�.
		System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
	}

	// ������ ��ǰ�� ȯ���Ѵ�.
	public void refund(Product p) {
		// ��ǰ�� Vector���� �����Ѵ�.
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		}
		// ���ſ� �����Ѱ��
		else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}

	// ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
	public void summary() {
		int sum = 0; // ������ ��ǰ�� �����հ�
		String itemList = ""; // ������ ��ǰ ���
		// Vector�� ����ִ��� Ȯ��
		if (item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for (int i = 0; i < item.size(); i++) {
			// Ÿ��üũ(����ȯ ���� ����)
			if (item.get(i) instanceof Product) {
				Product p = (Product) item.get(i); // ����Ÿ�Ժ���
				sum += p.price;
				itemList += ((i == 0) ? "" + p : " ," + p);
			} else {
				System.out.println("Product��ü�� �ƴմϴ�.");
			}
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}

}
