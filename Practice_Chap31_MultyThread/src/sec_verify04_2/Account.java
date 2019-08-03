package sec_verify04_2;


public class Account {

	private int balance;

	public synchronized int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		return this.balance;
	}

	public synchronized void setBalance(int balance) {
		this.balance = balance;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		//���� �������� ������ �̸��� balance���� ���
		System.out.println(Thread.currentThread().getName() + " ��/�� �Ա� : " + this.balance + "��");
	}
	
	public synchronized void withDraw(int money) {
		if(this.balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
				System.out.println(Thread.currentThread().getName() + " ��/�� ��� : " + money + "��");
				System.out.println("���� �ܾ� : " + this.getBalance() + "��");
			} catch (Exception e) {}
		}
		else {
			try {
				System.out.println(Thread.currentThread().getName() + " ��/�� " + money + "�� ��� �õ��Ͽ����ϴ�.");
				throw new Exception("�ܾ��� �����մϴ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
